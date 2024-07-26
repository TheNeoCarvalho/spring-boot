package com.manoel.os.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.manoel.os.services.DBService;

@Configuration(proxyBeanMethods = false)
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;

	@Bean
	void instanciaDB() {
		this.dbService.instanciaDB();
	}

}
