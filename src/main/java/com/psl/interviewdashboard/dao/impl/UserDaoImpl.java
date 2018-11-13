package com.psl.interviewdashboard.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.psl.interviewdashboard.dao.UserDao;
import com.psl.interviewdashboard.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

	public List<User> getUser() throws Exception {

		try {
			Session session = sessionFactory.getCurrentSession();

			@SuppressWarnings({ "unchecked", "deprecation" })
			List<User> list = session.createCriteria(User.class).list();
			return list;
		} catch (Exception e) {
			throw new Exception("Exception in getUser fucntion");
		}
	}

	public User findById(int id) throws Exception {
		// TODO Auto-generated method stub
		try {
			Session session = sessionFactory.getCurrentSession();
			User user = (User) session.get(User.class, id);
			return user;

		} catch (Exception e) {
			throw new Exception("Exception in getUser fucntion");
		}
	}

	public User update(User val, int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.get(User.class, id);
		user.setCity(val.getCity());
		user.setFirstName(val.getFirstName());
		session.update(user);
		return user;
	}

	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		User user = findById(id);
		session.delete(user);
	}

	@Override
	public User updateCity(User val, int id) {
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.load(User.class, id);
		user.setCity(val.getCity());
		return user;
	}

}
