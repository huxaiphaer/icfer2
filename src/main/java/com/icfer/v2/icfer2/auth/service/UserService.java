package com.icfer.v2.icfer2.auth.service;

import com.icfer.v2.icfer2.auth.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
