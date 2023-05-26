package police.controller.servlet;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import police.model.mapper.UserMapper;
import police.model.pojo.User;
import police.util.SqlSessionFactoryUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(username);
        System.out.println(password);

        User user1 = new User();
        user1.setId(username);
        user1.setPassword(password);

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.select(user1);
        System.out.println(user);

        sqlSession.close();


        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        if(user != null){
//            writer.write("µÇÂ¼³É¹¦");
            req.getRequestDispatcher("/html/map.html").forward(req,resp);
        }else{
            writer.write("µÇÂ½Ê§°Ü");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
