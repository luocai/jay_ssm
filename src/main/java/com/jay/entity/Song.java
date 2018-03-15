package com.jay.entity;

public class Song {
	private int id;
	private String name;
	private String album;
	private Integer time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", album=" + album + ", time=" + time + "]";
	}
	
}
