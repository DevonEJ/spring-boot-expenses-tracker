package com.expenses;

import java.util.Date;

public class Expense {

        private final long id;
        private final String name;
        private final double amount;
        private final Date paymentDate;

        public Expense(String name, double amount, Date paid) {
            this.id = this.setExpenseId();
            this.name = name;
            this.amount = amount;
            this.paymentDate = paid;
        }
    
        public long setExpenseId() {
            return id;
        }
    
        public long getId() {
            return id;
        }
    
    

    
}