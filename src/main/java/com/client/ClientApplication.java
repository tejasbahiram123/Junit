package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.addition.calculator.Sum;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		
		Sum sum = new Sum();
		
		int sum2 = sum.sum(10, 30);
		System.out.println("This result from client application"+sum2);
	}

	
	public String welcome() {
		return "welcome home";
		
	}
<<<<<<< Updated upstream

public String welcome3() {
	return "welcome home";
	
}

=======
>>>>>>> Stashed changes
	public String welcome2() {
		return "welcome home nashik";
		
	}
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
}
