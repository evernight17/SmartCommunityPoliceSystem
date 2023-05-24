package police.model.mapper;

import police.model.pojo.Event;


import java.util.List;

public interface EventMapper {
    List<Event> selectAll();
    Event selectById(String id);
    void add(Event event);
    void deleteById(String id);
    void update(Event event);
}
