package police.model.mapper;

import police.model.pojo.Device;

import java.util.List;

public interface DeviceMapper {
    List<Device> selectAll();
    Device selectById(String id);
    void add(Device device);
    void deleteById(String id);
    void update(Device device);
}
