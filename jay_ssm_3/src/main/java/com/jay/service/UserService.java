package com.jay.service;

import com.jay.entity.User;

public interface UserService {
	
	public void add(User user);
	public User findByName(String name);
}
