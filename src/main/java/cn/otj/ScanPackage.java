package cn.otj;

import java.util.List;

public interface ScanPackage {
    public List<Class> getClasses(String packageName)throws ClassNotFoundException;
}
