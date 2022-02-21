package com.otj.util;
import com.otj.Domain.Role;
import net.otj.domain.User;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class TypeHandler extends BaseTypeHandler<User> {

    public void setNonNullParameter(PreparedStatement preparedStatement, int i, User user, JdbcType jdbcType) throws SQLException {
        preparedStatement.setObject(i,user);
    }

    public User getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return new User();
    }

    public User getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    public User getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
