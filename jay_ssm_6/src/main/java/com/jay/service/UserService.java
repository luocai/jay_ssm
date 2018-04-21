package com.jay.service;

import com.jay.entity.User;

public interface UserService {
	
	public void add(User user)throws Exception;
	public User findByName(String name)throws Exception;
}
