package com.cakeshop.org.accounts;

import com.cakeshop.org.model.UserDetails;

public interface AccountsService {

    UserDetails checkUserLogin(String password,String username);
}
