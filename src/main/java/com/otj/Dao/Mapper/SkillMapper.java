package com.otj.Dao.Mapper;

import com.otj.Domain.Skill;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SkillMapper {

    @Select("select * from skill where rid=#{roleid}")
    List<Skill> findById(int roleid);

    @Insert("insert into skill values(skillid=#{skillid},)")
    void save(Skill skill);
}
