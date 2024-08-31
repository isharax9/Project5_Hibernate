package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HibernateUtil;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet(name = "SaveUser", urlPatterns = {"/SaveUser"})
public class SaveUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        User user = new User();
        user.setName("Muriya");
        user.setMobile("0710000125");
        
        session.save(user);
        session.beginTransaction().commit();
        
        session.close();
    }

}
