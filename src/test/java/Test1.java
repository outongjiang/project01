import com.otj.Domain.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test1 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void demo1(){

        List<Role>roles=jdbcTemplate.query("select * from role",new BeanPropertyRowMapper<Role>(Role.class));

        System.out.println(roles);

    }

}
