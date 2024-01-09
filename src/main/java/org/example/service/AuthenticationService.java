package org.example.service;

public class AuthenticationService {
    private static final String USERNAME = "nurane";
    private static final String PASSWORD = "password";

    public boolean authenticate(String username,String password){
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}
