package com.jay.mapper;

import java.util.List;

import com.jay.entity.PageBean;
import com.jay.entity.Song;

public interface SongMapper {
	
	public void add(Song s)throws Exception;
	public void delete(int id)throws Exception;
	public void update(Song s)throws Exception;
	public List<Song> query()throws Exception;
	public Song queryById(int id)throws Exception;
	
//	public List<Song> queryByPage(PageBean pb)throws Exception;
	public List<Song> queryByName(String name)throws Exception;
}
