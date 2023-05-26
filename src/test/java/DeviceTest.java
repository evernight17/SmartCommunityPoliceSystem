import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import police.model.mapper.DeviceMapper;
import police.model.pojo.Device;
import police.util.SqlSessionFactoryUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DeviceTest {
    @Test
    public void testSelectAll() throws IOException {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        DeviceMapper deviceMapper = sqlSession.getMapper(DeviceMapper.class);
        List<Device> devices = deviceMapper.selectAll();
        System.out.println(devices);

        sqlSession.close();

    }


    @Test
    public void testSelectById() throws IOException {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        DeviceMapper deviceMapper = sqlSession.getMapper(DeviceMapper.class);
        Device device = deviceMapper.selectById("C001");
        System.out.println(device);

        sqlSession.close();

    }

    @Test
    public void testAdd() throws IOException {
        Device device = new Device("C004","����ͷ","�人�к�ɽ��������ҵ��ѧͼ���","����");
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        DeviceMapper deviceMapper = sqlSession.getMapper(DeviceMapper.class);
        deviceMapper.add(device);

        sqlSession.close();

    }


    @Test
    public void testDeleteById() throws IOException {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        DeviceMapper deviceMapper = sqlSession.getMapper(DeviceMapper.class);
        deviceMapper.deleteById("C004");

        sqlSession.close();

    }

    @Test
    public void testUpdate() throws IOException {
        Device device = new Device("C004","����ͷ","�人�к�ɽ��������ҵ��ѧͼ���","����");
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        DeviceMapper deviceMapper = sqlSession.getMapper(DeviceMapper.class);
        deviceMapper.update(device);

        sqlSession.close();

    }
}
