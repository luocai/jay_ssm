package com.jay.service;

import java.util.List;

import com.jay.entity.PageBean;
import com.jay.entity.Song;
import com.jay.entity.User;

public interface SongService {

	public void add(Song s);
	public void delete(int id);
	public void update(Song s);
	public Song queryById(int id);
	public List<Song> queryAll();
	public List<Song> queryByPage(PageBean pb);
	
	public void register(User user);
	public boolean login(String name, String pass);
	public List<Song> findByName(String name);
}
