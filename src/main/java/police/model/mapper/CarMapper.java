package police.model.mapper;

import police.model.pojo.Car;

import java.util.List;

public interface CarMapper {
    List<Car> selectAll();
    Car selectById(String id);
    void add(Car car);
    void deleteById(String id);
    void update(Car car);
}
