package mainPackage.configs;

import mainPackage.services.Java;
import mainPackage.services.OfficeHours;
import mainPackage.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("mainPackage")
@PropertySource("classpath:application.properties")
public class CybertekAppConfig {
    @Bean
    public Java java(){
        return new Java(officeHours());
        //here we injected officeHours because we create inside the java class constructor
        //for that object so here we have to pass inside java to return the contructor to initiliaze the object!
    }
    @Bean
    public Selenium selenium(){
        return new Selenium();
    }
    @Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }

}
