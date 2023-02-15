package com.cakeshop.org.view.accounts;

import com.cakeshop.org.model.UserDetails;
import com.cakeshop.org.model.baseresponse.Data;
import jakarta.validation.constraints.NotNull;

public interface AccountsService {

   UserDetails  checkUserLogin(@NotNull String password, String username);
    String userRegister(UserDetails details);
}
