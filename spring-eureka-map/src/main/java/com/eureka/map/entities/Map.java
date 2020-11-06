package com.eureka.map.entities;

public class Map {
	private int id;
	private double longitude;
	private double latitude;
	private int range;
	
	public Map(int id, double latitude, double longitude, int range) {
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
		this.range = range;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLongitude() {
		return longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	
}
