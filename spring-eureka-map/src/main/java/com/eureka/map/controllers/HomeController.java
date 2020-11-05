package com.eureka.map.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.eureka.image.entities.Image;
import com.eureka.map.entities.Map;

@RestController
@RequestMapping("/")
public class HomeController {
	@Autowired
	private Environment env;
		
	@RequestMapping("/")
	public String home() {
		// This is useful for debugging
		// When having multiple instance of gallery service running at different ports.
		// We load balance among them, and display which instance received the request.
		return "Hello from Map Service running at port: " + env.getProperty("local.server.port");
	}
	
	@RequestMapping("/maps")
	public List<Map> getMaps() {
		List<Map> maps = Arrays.asList(
				new Map(1, 49.335096, -122.937257, 100),
				new Map(2, 49.322201, -122.980560, 200),
				new Map(3, 49.323323, -122.971282, 300));
		return maps;
		
	}
}