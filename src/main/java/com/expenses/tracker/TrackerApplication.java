package com.expenses.tracker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;

//import com.expenses.tracker.Expense;


@SpringBootApplication
@RestController
public class TrackerApplication {

	//TODO - Implement logging
	private static final Logger log = LoggerFactory.getLogger(TrackerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}

	
	@GetMapping("/")
	public String hello() {
	return "Welcome to the expenses logger!";
	}

	// @GetMapping("/listexpenses")
	// public String listAll(ExpenseRepository repository) {
	// Date date = new Date();
	// repository.save(new Expense("lunch", 15.00, date));
	// repository.save(new Expense("cinema", 25.00, date));
	// for (Expense expense: repository.findAll()) {
	// 	log.info(expense.toString());
	// 	}
	// return "That's everything.";
	// }


	@Bean
  	public CommandLineRunner demo(ExpenseRepository repository) {
    return (args) -> {
	  
	  repository.save(new Expense("lunch", "15.00", "date"));
	  repository.save(new Expense("cinema", "25.00", "date"));
     
      log.info("Expenses found with findAll():");
      log.info("-------------------------------");
      for (Expense expense: repository.findAll()) {
        log.info(expense.toString());
      }
      log.info("");

      log.info("Expense found with findByLastName('Bauer'):");
      log.info("--------------------------------------------");
      repository.findByName("lunch").forEach(lunch -> {
        log.info(lunch.toString());
      });

      log.info("");
    };

	

	// @GetMapping("/newexpense")
	// public String createExpense(@RequestParam(value = "name") String name) {
	// return String.format("New expense logged for %s!", name);
}

}
