package com.spring.demo.services;

import com.spring.demo.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    @Override
    public int getTeachingHours() {
       return 30;
    }
}
