package com.benedilson.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.benedilson.workshopmongo.domain.User;
import com.benedilson.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria", "maria@gamil.com");
		User jose = new User(null, "José", "jose@gamil.com");
		User jesus = new User(null, "Jesus", "jesus@gamil.com");
		
		userRepository.saveAll(Arrays.asList(maria, jose, jesus));
		
	}

}
