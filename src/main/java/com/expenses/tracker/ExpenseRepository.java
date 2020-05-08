package com.expenses.tracker;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ExpenseRepository extends CrudRepository<Expense, Long> {

  List<Expense> findByName(String name);

  Expense findById(long id);
}