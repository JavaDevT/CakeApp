package com.cakeshop.org.accounts;


import com.cakeshop.org.utils.HbmConfigApp;
import com.cakeshop.org.model.AdminLogin;
import com.cakeshop.org.model.UserDetails;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountsRepository implements AccountsDao {

    @Autowired
    private HbmConfigApp hibernateConfig;

    @Override
    public UserDetails getAvailableUser(String username, String pass) {
        Session session = hibernateConfig.getSessionFactory().openSession();
        Query query = session.createQuery("from UserDetails where userName=:userName and  password=:password");
        query.setParameter("userName", username);
        query.setParameter("password", pass);
        UserDetails user = (UserDetails) query.uniqueResult();
        if (user != null) {
            session.close();
            user.setAdmin(false);
            return user;
        } else {
            //no user availble chceck admin login

            Query admin = session.createQuery("from AdminLogin where userName=:userName and password=:password");
            admin.setParameter("userName", username);
            admin.setParameter("password", pass);
            AdminLogin adminModel = (AdminLogin) admin.uniqueResult();

            if (adminModel != null) {
                UserDetails userDetails = new UserDetails();
                userDetails.setAdmin(true);
                userDetails.setUsername(adminModel.getUserName());
                System.out.println("username and password availble");
                session.close();
                return userDetails;
            }
        }
        System.out.println("username and password not avialble");

        return null;
    }
}
