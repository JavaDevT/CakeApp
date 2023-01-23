package com.cakeshop.org.accounts;


import com.cakeshop.org.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountsService")
public class AccountsServiceImpl implements AccountsService {
    @Autowired
    AccountsDao  accountsDao;
    @Override
    public UserDetails checkUserLogin(String pass ,String username) {
         return accountsDao.getAvailableUser(username,pass);
      }

    @Override
    public String userRegister(UserDetails details) {
        return  accountsDao.userRegistration(details);
     }
}
