package com.cakeshop.org.model;


import javax.persistence.*;

@Entity
@Table(name="adminlogin")
public class AdminLogin  {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int adminId;
    private String userName;

    private String password;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return adminId;
    }

    public void setUserId(int adminId) {
        this.adminId = adminId;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
