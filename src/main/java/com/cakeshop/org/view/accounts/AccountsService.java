package com.cakeshop.org.view.accounts;

import com.cakeshop.org.model.UserDetails;

public interface AccountsService {

    UserDetails checkUserLogin(String password,String username);
    String userRegister(UserDetails details);
}
