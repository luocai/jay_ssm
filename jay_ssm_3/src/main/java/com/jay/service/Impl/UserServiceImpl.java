package com.jay.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.entity.User;
import com.jay.mapper.UserMapper;
import com.jay.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void add(User user) {
		
		userMapper.add(user);
	}

	@Override
	public User findByName(String name) {
		
		return userMapper.findByName(name);
	}

}
