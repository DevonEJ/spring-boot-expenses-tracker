package com.expenses.tracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringJUnitConfig
class ExpenseTest {

	
	@Test
	public void shouldReturnExpenseName() {
		Expense testExpense = new Expense("lunch", "5.99", "01-05-2020");

		assertEquals("lunch", testExpense.getName(), "Incorrect expense name returned.");
	}

	@Test
	public void shouldReturnStringExpenseAmount() {
		Expense testExpense = new Expense("lunch", "5.99", "01-05-2020");

		assertEquals("5.99", testExpense.getAmount(), "Incorrect expense amount returned.");
	}

	@Test
	public void shouldNotReturnIntegerExpenseAmount() {
		Expense testExpense = new Expense("lunch", "5.99", "01-05-2020");

		assertNotEquals(5.99, testExpense.getAmount(), "Incorrect expense amount type returned.");
	}

	@Test
	public void shouldReturnExpenseId() {
		Expense testExpense = new Expense("lunch", "5.99", "01-05-2020");

		assertNotNull(testExpense.getId(), "No ID returned for expense");
	}

	@Test
	public void shouldReturnExpensePaidDate() {
		Expense testExpense = new Expense("lunch", "5.99", "01-05-2020");

		assertEquals("01-05-2020", testExpense.getPaymentDate(), "Incorrect expense amount returned.");
	}

	@Test
	public void shouldReturnExpenseAsString() {
		Expense testExpense = new Expense("cinema", "10.99", "01-01-2020");

		long expectedID = testExpense.getId();

		String expectedOutput = String.format("Expense: [ID=%d, Name='cinema', Amount='10.99', PaymentDate='01-01-2020']", expectedID);

		assertEquals(expectedOutput, testExpense.toString(), "Incorrect expense details string returned.");
	}

}
