package police.controller.servlet;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import police.model.mapper.EventMapper;
import police.model.pojo.Event;
import police.util.SqlSessionFactoryUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/eventServlet")
public class EventServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
        List<Event> events = eventMapper.selectAll();
        System.out.println(events);
        sqlSession.close();

        for(int i = 0 ; i < events.size() ; i++){
            req.setAttribute("eventId", events.get(i).getEventId());
            req.setAttribute("reporter", events.get(i).getReporter());
            req.setAttribute("type", events.get(i).getType());
            req.setAttribute("location", events.get(i).getLocation());
            req.setAttribute("time", events.get(i).getTime());
            req.setAttribute("description", events.get(i).getDescription());
            req.setAttribute("status", events.get(i).getStatus());
        }

        req.getRequestDispatcher("/html/index1.html").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
