package com.cipy.webdi.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

//@Component("myComplexService")
//@Service
public class MyComplexService implements IService{
    
    @Override
    public String operacion(){
        return "Proceso importante complejo";
    }
}
