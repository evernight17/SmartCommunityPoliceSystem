import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import police.model.mapper.EventMapper;
import police.model.pojo.Event;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class EventTest {
    @Test
    public void testSelectAll() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
        List<Event> events = eventMapper.selectAll();
        System.out.println(events);

        sqlSession.close();

    }

    @Test
    public void testSelectById() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
        Event event = eventMapper.selectById("02");
        System.out.println(event);

        sqlSession.close();

    }

    @Test
    public void testAdd() throws IOException {
        Event event = new Event("03", "bob", "����", "������ҵ��ѧͼ���", "2023-03-10 17:07:44", "�ֻ���͵", "�Ѵ���");
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
        eventMapper.add(event);

        sqlSession.close();

    }


    @Test
    public void testDeleteById() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
        eventMapper.deleteById("03");

        sqlSession.close();

    }

    @Test
    public void testUpdate() throws IOException {
        Event event = new Event("03", "bob", "����", "������ҵ��ѧͼ���", "2023-03-10 17:07:44", "�ֻ���͵", "������");
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
        eventMapper.update(event);

        sqlSession.close();

    }


}
