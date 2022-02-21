package com.otj.Domain;

public class Department {
    private int deptid;
    private String deptname;
    private String description;
    private int rid;

    @Override
    public String toString() {
        return "Department{" +
                "deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                ", description='" + description + '\'' +
                ", rid=" + rid +
                '}';
    }

    public Department() {
    }

    public Department(int deptid, String deptname, String description, int rid) {
        this.deptid = deptid;
        this.deptname = deptname;
        this.description = description;
        this.rid = rid;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
}
