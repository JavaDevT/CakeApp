package com.cakeshop.org.accounts;

import com.cakeshop.org.model.UserDetails;

public interface AccountsDao {
    UserDetails getAvailableUser(String username, String pass);

    String userRegistration(UserDetails details);
}
