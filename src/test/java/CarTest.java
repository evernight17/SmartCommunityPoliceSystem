import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import police.model.mapper.CarMapper;
import police.model.pojo.Car;
import police.util.SqlSessionFactoryUtils;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CarTest {
    @Test
    public void testSelectAll() throws IOException {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = carMapper.selectAll();
        System.out.println(cars);

        sqlSession.close();

        }

    @Test
    public void testSelectById() throws IOException {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        Car car = carMapper.selectById("空D0001");
        System.out.println(car);

        sqlSession.close();

    }

    @Test
    public void testAdd() throws IOException {
        Car car = new Car("空D0007","mike","SUV","black");

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        carMapper.add(car);

        sqlSession.close();

    }


    @Test
    public void testDeleteById() throws IOException {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        carMapper.deleteById("空D0007");

        sqlSession.close();

    }


    @Test
    public void testUpdate() throws IOException {
        Car car = new Car("空D0007","mike","SUV","white");
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        carMapper.update(car);

        sqlSession.close();

    }

}
