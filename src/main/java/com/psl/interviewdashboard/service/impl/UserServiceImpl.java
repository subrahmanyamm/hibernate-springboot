package com.psl.interviewdashboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.psl.interviewdashboard.dao.UserDao;
import com.psl.interviewdashboard.model.User;
import com.psl.interviewdashboard.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
    UserDao userDao;


    public List<User> getUser() {
        // TODO Auto-generated method stub
    	System.out.println("in Servive block...");
    	try {
    		  return userDao.getUser();
    	}catch(Exception e) {
    		e.printStackTrace();
    		System.out.println("Exception.....");
    	}
      return null;
    }

    public User findById(int id) {
        // TODO Auto-generated method stub
        try {
			return userDao.findById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    public void createUser(User user) {
        // TODO Auto-generated method stub
        userDao.addUser(user);
    }

    public void deleteUserById(int id) throws Exception {
        // TODO Auto-generated method stub
        userDao.delete(id);
    }
    @Override
    public User updatePartially(User user, int id) throws Exception {
        userDao.updateCity(user,id);
        return userDao.findById(id);
    }

    @Override
    public User update(User user,int id) {
        // TODO Auto-generated method stub
        return userDao.update(user, id);
    }
}
