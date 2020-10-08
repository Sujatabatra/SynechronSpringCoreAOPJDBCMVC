package com.sujata.model.service;

import java.util.Set;

import com.sujata.bean.User;

public interface UserService {

	public boolean checkLogin(User user);
	public Set<String> getAllUserNamesOnly();
}
