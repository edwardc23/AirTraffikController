package com.example.demo.Services;

import com.example.demo.Entity.AirTraffic;
import com.example.demo.Entity.Login;
import com.example.demo.Repository.DAOLogin;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
@Service
public class LoginImpl implements DAOLogin {
    private EntityManager entityManager;
    @Autowired
    public LoginImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public String saveLogin(Login credentials)
    {
        Session current = entityManager.unwrap(Session.class);
        current.save(credentials);

        System.out.println(credentials.toString());
        return "done";
    }

    @Override
    public String findLogin(Login login) {
        Session current = entityManager.unwrap(Session.class);
        Login found= current.find(Login.class,login);
        if(found!=null)
        {
            return "Accepted";
        }
        return "Login not found";
    }
}
