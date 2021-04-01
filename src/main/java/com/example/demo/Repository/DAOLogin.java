package com.example.demo.Repository;

import com.example.demo.Entity.Login;

public interface DAOLogin {
    public String saveLogin(Login credentials);
    public String findLogin(Login login);
}
