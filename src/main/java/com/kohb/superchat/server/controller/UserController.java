package com.kohb.superchat.server.controller;

import com.kohb.superchat.server.entity.User;
import com.kohb.superchat.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value ="/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUsers(){

        return userService.getAll();
    }

    @RequestMapping(value ="/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("id") long userId){

        return userService.getById(userId);
    }

}
