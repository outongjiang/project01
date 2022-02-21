package com.otj.util;

import com.otj.Domain.Role;
import net.otj.Dao.RoleDao;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView=new ModelAndView();
        if(ex instanceof NullPointerException){
            modelAndView.setViewName("NullPointererror");
        }else if(ex instanceof ArithmeticException){
            modelAndView.setViewName("Arithmeticerror");
        }else {
            modelAndView.setViewName("other");
        }
        return modelAndView;
    }
}
