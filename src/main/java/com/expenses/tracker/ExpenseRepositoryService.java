package com.expenses.tracker;

import org.springframework.stereotype.Service;

@Service
public class ExpenseRepositoryService {

    private ExpenseRepository expenseRepository;

    public ExpenseRepositoryService(ExpenseRepository userRepository) {
        this.expenseRepository = userRepository;
        //TODO - Remove print, just here to use attribute
        System.out.println(expenseRepository);
    }

    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }
  }
    


