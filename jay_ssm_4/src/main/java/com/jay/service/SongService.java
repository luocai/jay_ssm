package com.jay.service;

import java.util.List;

import com.jay.entity.PageBean;
import com.jay.entity.Song;
import com.jay.entity.User;

public interface SongService {

	public void add(Song s)throws Exception;
	public void delete(int id)throws Exception;
	public void update(Song s)throws Exception;
	public Song queryById(int id)throws Exception;
	public List<Song> queryAll()throws Exception;
	public List<Song> queryByPage(PageBean pb)throws Exception;
	public List<Song> findByName(String name)throws Exception;
}
