package cn.itcast.travel.test;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;


public class TestJDBC {
    @Test
    public void testConnection(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        System.out.println(template);
    }

    @Test
    public void testRegist(){
        UserDao dao = new UserDaoImpl();
        dao.findByUserName("1111111");
    }

    @Test
    public void test3(){
        User user = new User();
        user.setUsername("12345678");
        user.setPassword("12345678");
        user.setBirthday("2019-09-09");
        user.setName("123");
        user.setSex("男");
        user.setEmail("123@qq.com");
        user.setTelephone("12345678910");
        UserDao dao = new UserDaoImpl();
        dao.save(user);
    }
}
