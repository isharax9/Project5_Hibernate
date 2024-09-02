package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Country;
import model.HibernateUtil;
import model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

@WebServlet(name = "SearchUser1", urlPatterns = {"/SearchUser1"})
public class SearchUser1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Criteria criteria = session.createCriteria(Country.class);

        criteria.add(Restrictions.eq("name", "LK"));

//        Country country = (Country) criteria.list().get(0);
        Country country = (Country) criteria.uniqueResult();

        List<User> userList = country.getUserList();

        for (User user : userList) {
            System.out.println(user.getName());
        }

        session.close();
    }

}
