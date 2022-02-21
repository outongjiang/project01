package com.otj.Dao;


import com.otj.Domain.Role;

import java.util.List;

public interface RoleDao {
    public void save();
    public List<Role> findAll();
}
