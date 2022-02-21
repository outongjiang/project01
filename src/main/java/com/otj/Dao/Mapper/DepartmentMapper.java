package com.otj.Dao.Mapper;

import com.otj.Domain.Department;
import com.otj.Domain.Skill;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface DepartmentMapper {
    @Select("select * from department where rid=#{roleid}")
     Department findById(int roleid);

    /*
    private int deptid;
    private String deptname;
    private String description;
    private int rid;
    * */

    @Insert("insert into department values(#{deptid},#{deptname}" +
            ",#{description},#{rid})")
    void save(Department department);
}
