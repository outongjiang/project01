package com.otj.Service.Interface;

import com.otj.Domain.Role;

import java.util.List;

public interface RoleService {
    public List<Role>findAll() throws InterruptedException;
}
