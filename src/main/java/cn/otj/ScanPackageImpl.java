package cn.otj;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//通过包名可以获取到包下所有的java Class文件封装的集合对象
// 即获取到xxx.xxx包下的  List<Class>
public class ScanPackageImpl implements ScanPackage{

    private static List<Class>classList;

    static {
        classList=new ArrayList<Class>();
    }
    private static List<Class> getClassList() {
        return classList;
    }

    private static void getFile(File file, String packageName) throws ClassNotFoundException {

            for(File f:file.listFiles()){
                if(f.isFile()){
                    if(f.getName().contains("java")){
                        System.out.println(f.getName());
                        String className=f.getPath().replace("\\",".");
                        className=className.replace("src.main.java.","");
                        className=className.replace(".java","");
                        classList.add(Class.forName(className));
                    }
                }else{
                    getFile(f, packageName);
                }
            }

    }


    public List<Class> getClasses(String packageName) throws ClassNotFoundException {
        String path="src\\main\\java\\"+packageName.replace(".","\\\\");
        getFile(new File(path),packageName);
        return ScanPackageImpl.getClassList();
    }
}
