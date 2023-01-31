package com.cakeshop.org.view.accounts;


import com.cakeshop.org.model.UserDetails;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("accountsService")
public class AccountsServiceImpl implements AccountsService {
    @Autowired
    AccountsDao  accountsDao;

    @PostConstruct
    public void init() {
        System.out.println("PropertyLoader.init()");
    }
    @Override
    public UserDetails checkUserLogin(String pass ,String username) {
        System.out.println("AccountsServiceImpl");
        return accountsDao.getAvailableUser(username,pass);
      }

    @Override
    public String userRegister(UserDetails details) {
        return  accountsDao.userRegistration(details);
     }
}
