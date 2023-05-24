import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import police.model.mapper.UserMapper;
import police.model.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserTest {
    @Test
    public void testSelectAll() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();
        System.out.println(users);

        sqlSession.close();


    }

    @Test
    public void testSelectById() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectById("0001");
        System.out.println(user);

        sqlSession.close();


    }

    @Test
    public void testAdd() throws IOException {
        User user = new User("0005","jack","55555","555");
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.add(user);

        sqlSession.close();
    }

    @Test
    public void testDeleteById() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteById("0005");

        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {
        User user = new User("0005","jack","55555","666");
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.update(user);

        sqlSession.close();
    }
}
