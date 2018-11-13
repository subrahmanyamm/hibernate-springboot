package com.psl.interviewdashboard.service;

import java.util.List;

import com.psl.interviewdashboard.model.User;

public interface UserService {
	public void createUser(User user);
    public List<User> getUser();
    public User findById(int id);
    public User update(User user, int id);
    public void deleteUserById(int id) throws Exception;
    public User updatePartially(User user, int id) throws Exception;

}
