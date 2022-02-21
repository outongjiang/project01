package com.otj.util;

import org.springframework.core.convert.converter.Converter;

public class MyConverter implements Converter<String,String> {
    public String convert(String source) {

        return source;
    }
}
