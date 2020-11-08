package com.eureka.map.controllers;

class MapNotFoundException extends RuntimeException {
	MapNotFoundException(int id){
		super("Could not find map " + id);
	}
}
