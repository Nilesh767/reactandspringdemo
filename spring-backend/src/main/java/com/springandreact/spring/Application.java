package com.springandreact.spring;

import com.springandreact.spring.model.User;
import com.springandreact.spring.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Nilesh", "Choudhary", "test@test.com"));
		this.userRepository.save(new User("Nile", "C", "test1@test.com"));
		this.userRepository.save(new User("Nil", "blah", "test2@test.com"));
	}

}
