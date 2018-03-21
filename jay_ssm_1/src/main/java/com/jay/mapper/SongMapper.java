package com.jay.mapper;

import java.util.List;

import com.jay.entity.Song;

public interface SongMapper {
	
	public void add(Song s);
	public void delete(int id);
	public void update(Song s);
	public List<Song> queryAll();
	public Song queryById(int id);
}
