package com.sujata.model.persistence;

import java.util.HashMap;
import java.util.Set;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

	private static HashMap<String, String> users=new HashMap<String, String>();
	
	static{
		users.put("user1", "aaa");
		users.put("admin", "super");
		users.put("sujata", "batra");
	}

	public String getPassword(String userName) {
		
		return users.get(userName);
	}
	
	public Set<String> getAllUserNames(){
		return users.keySet();
	}
	
}
