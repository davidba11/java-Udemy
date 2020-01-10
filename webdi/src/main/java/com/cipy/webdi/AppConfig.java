package com.cipy.webdi;

import com.cipy.webdi.models.service.IService;
import com.cipy.webdi.models.service.MyComplexService;
import com.cipy.webdi.models.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    
    @Bean("mySimpleService")
    @Primary
    public IService registrarMiServicio(){
        return new MyService();
    }
    
    @Bean("myComplexService")
    public IService registrarMiServicioComplejo(){
        return new MyComplexService();
    }
}
