package cn.otj;

import java.util.HashMap;

public class ApplicationC {

    private static HashMap<Class, Object> beans2;
    private  void setBeans(HashMap<Class, Object> beans) {
        beans2=beans;
    }
    public Object getBean(Class c){
        return beans2.get(c);
    }
}
