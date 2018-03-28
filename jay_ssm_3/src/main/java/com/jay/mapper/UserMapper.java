package com.jay.mapper;

import com.jay.entity.User;

public interface UserMapper {

	public void add(User user);
	public User findByName(String name);
}
