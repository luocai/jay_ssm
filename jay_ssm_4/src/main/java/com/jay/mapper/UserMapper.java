package com.jay.mapper;

import com.jay.entity.User;

public interface UserMapper {

	public void add(User user)throws Exception;
	public User findByName(String name)throws Exception;
}
