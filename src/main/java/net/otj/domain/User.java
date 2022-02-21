package net.otj.domain;

import cn.annotation.AutoW;
import cn.annotation.CPN;

@CPN
public class User {
    @AutoW
    public  Role role;

    public void save() {
        role.save();
    }
}
