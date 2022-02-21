package com.otj.util;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("MyAspect")
@Aspect
public class MyAspect {
    static {
        System.out.println("加载MyAspect.......");
    }
    @AfterThrowing("execution(* com.otj.util.*.*(..))")
    public void before(){
        System.out.println("前置增强");
    }

    @Pointcut("execution(* com.otj.util.*.*(..))")
    public void flag(){}
}
