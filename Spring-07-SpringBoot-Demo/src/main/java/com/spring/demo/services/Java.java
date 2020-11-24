package com.spring.demo.services;

import com.spring.demo.interfaces.Course;
import com.spring.demo.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Value("${instructor}")
    private String instructorName;
    private ExtraSession extraSession;

    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public int getTeachingHours() {
       return 20 +extraSession.getHours();
    }
}
