package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.service.*;
import com.service.userDao.userDao;
 
@Service
public class UserService {
 
    @Autowired
    private userDao dao;
 
    public void insetUser(User user) {
        this.dao.insertUser(user);
    }
 
    public List<User> getAllUsers() {
        List<User> list = this.dao.getAllUsers();
        return list;
    }
 
    public void delete(int id) {
        this.dao.delete(id);
    }
 
    public User getUserById(int id) {
 
        User u = this.dao.getUserById(id);
        return u;
    }
public void updateUser(User user) {
        
        this.dao.updateUser(user);
    }
}
 