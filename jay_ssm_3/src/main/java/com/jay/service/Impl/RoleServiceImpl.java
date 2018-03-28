package com.jay.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.entity.Role;
import com.jay.mapper.RoleMapper;
import com.jay.service.RoleService;


@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public Role findById(int id) {
		
		return roleMapper.findById(id);
	}

}
