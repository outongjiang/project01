package com.otj.Domain;

import java.util.Date;
import java.util.List;

public class Role {
   private int roleid;
//   private User  rolename;
    private String rolename;
   private int status;
   private String password;
//   private Date date;
    private Department department;
    private List<Skill>skills;
    private List<Equipment>equipments;
    public Role() {
    }

    public Role(int roleid, String rolename, int status, String password) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.status = status;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", status=" + status +
                ", password='" + password + '\'' +
                ", department=" + department +
                ", skills=" + skills +
                ", equipments=" + equipments +
                '}';
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }


    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
//    public User getRolename() {
//        return rolename;
//    }
//
//    public void setRolename(User rolename) {
//        this.rolename = rolename;
//    }

//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
