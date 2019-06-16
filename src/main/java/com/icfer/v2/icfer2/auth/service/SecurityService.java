package com.icfer.v2.icfer2.auth.service;

public interface SecurityService {

    String findLoggedInUser();

    void autoLogin(String username, String password);

}
