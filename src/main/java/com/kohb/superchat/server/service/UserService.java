package com.kohb.superchat.server.service;

import com.kohb.superchat.server.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getById(long id);
}
