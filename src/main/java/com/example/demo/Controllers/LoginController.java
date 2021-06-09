package com.example.demo.Controllers;

import com.example.demo.Entity.AirTraffic;
import com.example.demo.Entity.Login;
import com.example.demo.Repository.DAOLogin;
import com.example.demo.Services.LoginImpl;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class LoginController {
    private final LoginImpl loginImpl;
    private final DAOLogin DAOLogin;

    public LoginController(LoginImpl loginImpl, DAOLogin DAOLogin)
    {
        this.loginImpl = loginImpl;
        this.DAOLogin = DAOLogin;
    }

    @PostMapping("/addLogin")
    public String addLogin(@RequestBody Login login)
    { return DAOLogin.saveLogin(login); }



    @PostMapping("/check")
    public String checkLogin(@RequestBody Login login){
        String response = DAOLogin.findLogin(login);
        return response;

    }






}
