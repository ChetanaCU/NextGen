package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository)
	{
		return new CommandLineRunner()
		{
			@Override
			public void run(String... arg0) throws Exception {
				userRepository.save(new Users("Robert","Patinson"));
				userRepository.save(new Users("Kit","Harington"));
			}

		};
	}
}
