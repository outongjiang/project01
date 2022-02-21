package com.otj.Dao.Mapper;

import com.otj.Domain.Equipment;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EquipmentMapper {
    @Select("select * from equipment,role_equipment where rid=#{roleid} and eid=equipmentid ")
    public List<Equipment>findById(int roleid);
}
