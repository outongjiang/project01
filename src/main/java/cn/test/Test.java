package cn.test;

import cn.otj.ApplicationC;
import cn.otj.ScanPackage;
import cn.otj.ScanPackageImpl;
import net.otj.domain.Role;
import net.otj.Dao.RoleDao;
import net.otj.Dao.UserDao;
import net.otj.domain.User;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

public class Test {
    public static void getFile(File file){


        try {
            for(File file1:file.listFiles()){

                if(file1.isFile()){
                    System.out.println("................"+file1.getName());
                }else if(file1.isDirectory()){
                    System.out.println("***********"+file1.getName());
                    getFile(file1);
                }
            }
        }catch (Exception e){

        }
    }
    public static void getFieldInstance(RoleDao roleDao){
        User user=new User();
        roleDao.user=user;
        getFieldInstance2(user);
    }
    public static void getFieldInstance2(User user){
        user.role= new Role();
    }

    public static void main(String[] args) throws Exception {
        ApplicationC applicationC=new ApplicationC();
        RoleDao roleDao= (RoleDao) applicationC.getBean(RoleDao.class);
        roleDao.save();
    }
}
