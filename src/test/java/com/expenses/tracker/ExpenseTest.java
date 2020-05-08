package com.expenses.tracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
class ExpenseTest {

	
	@Test
	public void shouldReturnExpenseName() {
		Expense testExpense = new Expense("lunch", "5.99", "01-05-2020");

		assertEquals("lunch", testExpense.getName(), "Incorrect expense name returned.");
	}


}
