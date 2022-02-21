package com.otj.Dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.otj.Domain.Role;
import com.otj.util.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//
//@PropertySource("classpath:druid.properties")
@Repository("roleDao")
public class RoleDaoImpl implements RoleDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void save() {
        jdbcTemplate.update("insert into role values (?,?,?,?)",null,"张无极",0,"222");
    }

    public List<Role> findAll() {
        return null;
    }
}
