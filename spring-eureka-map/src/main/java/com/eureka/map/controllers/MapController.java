package com.eureka.map.controllers;

import com.eureka.map.repository.MapRepository;
import com.eureka.map.entities.Map;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/")
public class MapController {
	private static final Logger log = LoggerFactory.getLogger(MapController.class);

	private final MapRepository repository;
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	MapController(MapRepository repository){
		this.repository = repository;		
	}
		
	@RequestMapping("/port")
	public String home() {
		// This is useful for debugging
		// When having multiple instance of gallery service running at different ports.
		// We load balance among them, and display which instance received the request.
		return "Hello from Map Service running at port: " + env.getProperty("local.server.port");
	}
	
	//Aggregate
	@GetMapping("/")
	List<Map> all() {
		return repository.findAll();
	}
	
	@PostMapping("/")
	Map newMap(@RequestBody Map newMap) {
		return repository.save(newMap);
	}
	
	//Single Listing
	@GetMapping("/{id}")
	Map one(@PathVariable int id) {
		return repository.findById(id)
			      .orElseThrow(() -> new MapNotFoundException(id));

	}
	
	@PutMapping("/{id}")
	  Map replacemap(@RequestBody Map newMap, @PathVariable int id) {

	    return repository.findById(id)
	      .map(map -> {
	    	  map.setLatitude(newMap.getLatitude());
	    	  map.setLongitude(newMap.getLongitude());
	    	  map.setRange(newMap.getRange());
	    	  return repository.save(map);
	      })
	      .orElseGet(() -> {
	        newMap.setId(id);
	        return repository.save(newMap);
	      });
	  }

	  @DeleteMapping("/{id}")
	  void deletemap(@PathVariable int id) {
	    repository.deleteById(id);
	  }
	
	
}