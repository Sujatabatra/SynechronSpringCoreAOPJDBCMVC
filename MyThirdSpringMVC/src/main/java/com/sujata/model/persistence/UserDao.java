package com.sujata.model.persistence;

import java.util.Set;

public interface UserDao {
	
	String getPassword(String userName);
	public Set<String> getAllUserNames();

}
