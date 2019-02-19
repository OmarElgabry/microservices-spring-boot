package com.eureka.image.entities;

public class Image {
	private int id;
	private String name;
	private String url;
	
	public Image(int id, String name, String url) {
		this.id = id;
		this.name = name;
		this.url = url;
	}
	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}

