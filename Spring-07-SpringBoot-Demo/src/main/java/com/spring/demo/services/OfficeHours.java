package com.spring.demo.services;

import com.spring.demo.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSession {

    @Override
    public int getHours() {
        return 5;
    }
}
