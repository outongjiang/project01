package com.otj.Dao.Mapper;

import com.otj.Domain.Department;
import com.otj.Domain.Role;
import com.otj.Domain.Skill;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RoleMapper {
    List<Role> findById(Role role);
    @Select("select * from role")
    @Results({
            @Result(id = true,property ="roleid" ,column ="roleid" ),
            @Result(property ="rolename" ,column ="rolename" ),
            @Result(property ="equipments" ,column ="roleid",javaType = List.class
            ,many = @Many(select = "com.otj.Dao.Mapper.EquipmentMapper.findById")
            )
    })
    List<Role> findAll();
    List<Role>findByIds(List<Integer>ids);


    void save(Role role);
}
