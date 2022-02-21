package com.otj.Service;

import com.otj.Dao.RoleDao;
import com.otj.Domain.Role;
import com.otj.Service.Interface.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;



    @Transactional
    public List<Role> findAll() throws InterruptedException {
        roleDao.save();
//        int i=1/0;
//        roleDao.save();
        return null;
    }
}
