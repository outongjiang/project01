package com.otj.Domain;

public class Skill {
    private int skillid;
    private String skillname;
    private int attack;
    private int defendse;
    private String grade;
    private int rid;

    @Override
    public String toString() {
        return "Skill{" +
                "skillid=" + skillid +
                ", skillname='" + skillname + '\'' +
                ", attack=" + attack +
                ", defendse=" + defendse +
                ", grade='" + grade + '\'' +
                ", rid=" + rid +
                '}';
    }

    public int getSkillid() {
        return skillid;
    }

    public void setSkillid(int skillid) {
        this.skillid = skillid;
    }

    public String getSkillname() {
        return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefendse() {
        return defendse;
    }

    public void setDefendse(int defendse) {
        this.defendse = defendse;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
}
