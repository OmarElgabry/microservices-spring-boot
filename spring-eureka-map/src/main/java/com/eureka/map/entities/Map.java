package com.eureka.map.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Map {
	private @Id @GeneratedValue int id;
	private double longitude;
	private double latitude;
	private int range;
	
	public Map() {}
	
	public Map(double latitude, double longitude, int range) {
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
