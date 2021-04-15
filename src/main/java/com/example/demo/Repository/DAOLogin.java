package com.example.demo.Repository;

import com.example.demo.Entity.Login;

public interface DAOLogin {
    String saveLogin(Login credentials);
    String findLogin(Login login);
}
