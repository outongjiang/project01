package com.otj.util;

import org.springframework.stereotype.Component;

@Component("Target")
public class TargetClass implements Target{
    public void save() {
        System.out.println("save running...");
        int i=1/0;
    }
}
