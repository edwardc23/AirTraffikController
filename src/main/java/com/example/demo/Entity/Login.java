package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="login_Id")
    private int loginID;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "airlinePassword")
    private String airlinePassword;

    public Login(String username, String password, String airlinePassword) {
        this.username = username;
        this.password = password;
        this.airlinePassword = airlinePassword;
    }
    public Login(){}

    public int getLoginID() {
        return loginID;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAirlinePassword() {
        return airlinePassword;
    }

    public void setAirlinePassword(String airlinePassword) {
        this.airlinePassword = airlinePassword;
    }
}
