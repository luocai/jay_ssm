package com.jay.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.entity.PageBean;
import com.jay.entity.Song;
import com.jay.entity.User;
import com.jay.mapper.SongMapper;
import com.jay.mapper.UserMapper;
import com.jay.service.SongService;

@Service
public class SongServiceImpl implements SongService{
	
	@Autowired
	private SongMapper songMapper;
	
	@Autowired
	private UserMapper userMapper;

	public void add(Song s) {
		songMapper.add(s);
	}

	
	public void delete(int id) {
		songMapper.delete(id);
	}

	public void update(Song s) {
		songMapper.update(s);
	}

	public Song queryById(int id) {
		Song s = songMapper.queryById(id);
		return s;
	}

	public List<Song> queryAll() {
		List<Song> list = songMapper.queryAll();
//System.out.println("");
//System.out.println("queryALL");
		return list;
	}


	public void register(User user) {
		userMapper.register(user);
		
	}


	public boolean login(String name,String pass) {
		
		User user = userMapper.login(name);
		if (user == null)
			return false;
		if (pass.equals(user.getPassword()))
			return true;
		else
			return false;
	}


	public List<Song> queryByPage(PageBean pb) {
		
		return songMapper.queryByPage(pb);
	}


	public List<Song> findByName(String name) {
		
		return songMapper.queryByName(name);
	}
	
	

}
