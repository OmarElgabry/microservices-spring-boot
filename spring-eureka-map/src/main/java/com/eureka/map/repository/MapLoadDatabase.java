package com.eureka.map.repository;

import com.eureka.map.entities.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapLoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(MapLoadDatabase.class);

	@Bean
	  CommandLineRunner initDatabase(MapRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new Map(49.335096, -122.937257, 100)));
	      log.info("Preloading " + repository.save(new Map(49.322201, -122.980560, 200)));
	      log.info("Preloading " + repository.save(new Map(49.323323, -122.971282, 300)));
	    };
	  }
}

