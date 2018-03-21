package com.jay.mapper;

import com.jay.entity.User;

public interface UserMapper {

	public void register(User user);
	public User login(String name);
}
