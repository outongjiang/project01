package cn.otj;
import cn.annotation.AutoW;
import cn.annotation.CPN;
import net.otj.Dao.RoleDao;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class DispatcherServletX implements Filter {
    private static String packageName;
    private static HashMap<Class,Object>beans=new HashMap<Class, Object>();

    public void init(FilterConfig filterConfig) throws ServletException {

        String path=filterConfig.getInitParameter("contextConfigLocation");
        Document document=null;
        try {
            document =Jsoup.parse(new File("src\\main\\resources\\"+path.replace("classpath:","")),"utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Element element=document.getElementsByTag("scanPackage").get(0);
        packageName=element.text();
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ScanPackage scanPackage=new ScanPackageImpl();
        List<Class>classes=null;
        Object o=null;
        try {
           classes=scanPackage.getClasses(packageName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //遍历每个被扫描的类
        for(Class c:classes){
            //判断是否有注解
            if(c.isAnnotationPresent(CPN.class)) {
                try {
                    o = c.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                getFieldInstance(c, o);
                beans.put(c, o);
            }
        }
        Class c=ApplicationC.class;
        try {

            Method m =c.getDeclaredMethod("setBeans",beans.getClass());
            m.setAccessible(true);
            m.invoke(c.newInstance(),beans);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        ApplicationC applicationC=new ApplicationC();
        RoleDao roleDao= (RoleDao) applicationC.getBean(RoleDao.class);
        roleDao.save();
    }
    private static void getFieldInstance(Class c,Object o){
        if(c.isAnnotationPresent(CPN.class)){
            for(Field field:c.getFields()){
                field.setAccessible(true);
                if(field.isAnnotationPresent(AutoW.class)){
                    try {
                        Object fieldInstance=field.getType().newInstance();
                        field.set(o,fieldInstance);
                        getFieldInstance(fieldInstance.getClass(),fieldInstance);
                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public void destroy() {

    }
}
