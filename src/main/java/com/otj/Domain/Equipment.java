package com.otj.Domain;

public class Equipment {
    private int equipmentid;
    private String equipmentname;
    private int attack;
    private int defense;
    private String grade;

    @Override
    public String toString() {
        return "Equipment{" +
                "equipmentid=" + equipmentid +
                ", equipmentname='" + equipmentname + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                ", grade='" + grade + '\'' +
                '}';
    }

    public int getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(int equipmentid) {
        this.equipmentid = equipmentid;
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
