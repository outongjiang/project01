package net.otj.Dao;

import cn.annotation.AutoW;
import cn.annotation.CPN;
import net.otj.domain.User;
@CPN
public class RoleDao {
    @AutoW
    public User user;

    public void save() {
        user.save();
    }
}
