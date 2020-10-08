package com.sujata.model.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.User;
import com.sujata.model.persistence.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public boolean checkLogin(User user) {
		String password=userDao.getPassword(user.getUserName());
		if(password!=null && password.equals(user.getPassword()))
			return true;
		return false;
	}

	public Set<String> getAllUserNamesOnly() {
		return userDao.getAllUserNames();
	}

}
