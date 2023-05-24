package police.model.mapper;

import police.model.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
    User selectById(String id);
    void add(User user);
    void deleteById(String id);
    void update(User user);
}
