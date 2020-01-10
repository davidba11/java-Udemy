package com.cipy.webdi.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//@Primary
//@Component("mySimpleService")
//@Service
public class MyService implements IService{
    
    @Override
    public String operacion(){
        return "Proceso importante simple";
    }
}
