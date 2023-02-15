package com.cakeshop.org.view.accounts;


import com.cakeshop.org.model.UserDetails;
import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountsService")
public class AccountsServiceImpl implements AccountsService {
    @Autowired
    AccountsDao  accountsDao;
    @Override
    public UserDetails checkUserLogin(@NotNull String pass , String username) {
         return accountsDao.getAvailableUser(username,pass);
      }

    @Override
    public String userRegister(UserDetails details) {
        return  accountsDao.userRegistration(details);
     }
}
