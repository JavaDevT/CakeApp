package com.cakeshop.org.view.accounts;

import com.cakeshop.org.model.UserDetails;
import jakarta.validation.constraints.NotNull;

public interface AccountsDao {
    UserDetails getAvailableUser(@NotNull String username, String pass);

    String userRegistration(UserDetails details);
}
