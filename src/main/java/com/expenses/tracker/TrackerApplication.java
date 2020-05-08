package com.expenses.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// import com.expenses.Expense;


@SpringBootApplication
@RestController
public class TrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
	return "Welcome to the expenses logger!";
	}

	@GetMapping("/newexpense")
	public String expense(@RequestParam(value = "name") String name) {
	return String.format("New expense logged for %s!", name);
}

}

