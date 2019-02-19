package com.eureka.gallery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eureka.gallery.entities.Gallery;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/")
public class HomeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	@RequestMapping("/")
	public String home() {
		// This is useful for debugging
		// When having multiple instance of gallery service running at different ports.
		// We load balance among them, and display which instance received the request.
		return "Hello from Gallery Service running at port: " + env.getProperty("local.server.port");
	}
  
	@HystrixCommand(fallbackMethod = "fallback")
	@RequestMapping("/{id}")
	public Gallery getGallery(@PathVariable final int id) {
		LOGGER.info("Creating gallery object ... ");
		
		// create gallery object
		Gallery gallery = new Gallery();
		gallery.setId(id);

		// get list of available images 
		// @SuppressWarnings("unchecked")    // we'll throw an exception from image service to simulate a failure
		List<Object> images = restTemplate.getForObject("http://image-service/images/", List.class);
		gallery.setImages(images);
	
		return gallery;
	}
	
	// -------- Admin Area --------
	// This method should only be accessed by users with role of 'admin'
	// We'll add the logic of role based auth later
	@RequestMapping("/admin")
	public String homeAdmin() {
		return "This is the admin area of Gallery service running at port: " + env.getProperty("local.server.port");
	}
	
	// a fallback method to be called if failure happened
	public Gallery fallback(int galleryId, Throwable hystrixCommand) {
		return new Gallery(galleryId);
	}
}