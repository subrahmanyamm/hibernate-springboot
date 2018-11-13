package com.psl.interviewdashboard.dao;

import java.util.List;

import com.psl.interviewdashboard.model.User;

public interface UserDao {
    public void addUser(User user);
    public List<User> getUser() throws Exception;
    public User findById(int id) throws Exception;
    public User update(User user, int id);
    public User updateCity(User user, int id);
    public void delete(int id) throws Exception;
}