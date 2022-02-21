package com.otj.util;
import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.otj.Dao.Mapper.DepartmentMapper;
import com.otj.Dao.Mapper.RoleMapper;
import com.otj.Domain.Department;
import com.otj.Domain.Role;
import com.otj.Service.Interface.RoleService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//@Configuration("Base")
//@ComponentScan("com.otj")
public class Base {

//    static {
//        System.out.println("这是Service层.........");
//    }
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException, SQLException {
        InputStream is= Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession =sqlSessionFactory.openSession(true);

//        sqlSession.insert("roleMapper.delById",role);

        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        departmentMapper.save(new Department(5,"黑木崖","???",5));
       RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
//        List<Integer>roleids=new ArrayList<Integer>();
//        roleids.add(1);
//        roleids.add(3);
//        PageHelper.startPage(1,2);
        List<Role>roles=roleMapper.findAll();
//        PageInfo<Role>pageInfo=new PageInfo<Role>(roles);
        for (Role role : roles) {
            System.out.println(role);
        }
//      System.out.println("总条数为:"+pageInfo.getPageNum());



    }
}
