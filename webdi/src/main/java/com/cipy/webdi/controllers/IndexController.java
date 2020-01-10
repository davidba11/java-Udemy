package com.cipy.webdi.controllers;

import com.cipy.webdi.models.service.IService;
//import com.cipy.webdi.models.services.MyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    //private MyServices servicio= new MyServices();
    @Autowired
    //private MyServices servicio;
    @Qualifier("myComplexService")
    private IService servicio;
    
    @GetMapping({"/", "", "/index"})
    public String index(Model model){
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }
    
    /*@Autowired
    public void setServicio(IService servicio) {
        this.servicio = servicio;
    }*/
    
    @Autowired
    
    public IndexController(IService servicio) {
        this.servicio = servicio;
    }
    
}
