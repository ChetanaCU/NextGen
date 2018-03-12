package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

	private UserRepository userRepository;

	@GetMapping("/getAll")
	public List<Users> getAll(){
		System.out.println("In controller");
		return userRepository.findAll();

	}
}
