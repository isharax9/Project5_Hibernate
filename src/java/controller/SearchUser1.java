package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HibernateUtil;
import model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

@WebServlet(name = "SearchUser1", urlPatterns = {"/SearchUser1"})
public class SearchUser1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Criteria criteria = session.createCriteria(User.class);
        
        criteria.add(Restrictions.eq("name", "Sahan"));
        criteria.add(Restrictions.eq("mobile", "0710000125"));
        
        ArrayList<User> userList = (ArrayList<User>) criteria.list();

        for (User user : userList) {
            System.out.println(user.getId());
        }
        session.close();
    }

}
