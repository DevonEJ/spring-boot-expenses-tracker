package com.expenses;

import java.util.Date;
import java.util.UUID;

public class Expense {

        private final UUID id;
        private final String name;
        private final double amount;
        private final Date paymentDate;

        Expense() {
            this.id = generateExpenseId();  
            this.name = "";
            this.amount = 0.0;
            this.paymentDate = new Date();
        }

        Expense(String expenseName, double expenseAmount, Date paid) {
            this.id = generateExpenseId();
            this.name = expenseName;
            this.amount = expenseAmount;
            this.paymentDate = paid;
        }
    
        public static UUID generateExpenseId() {
            UUID uniqueID = UUID.randomUUID();
            return uniqueID;
        }


        public static void main(String[] args) {

            Date date = new Date();  

            Expense test = new Expense();
            System.out.println(test.id);


            Expense myExpense = new Expense("food", 20.00, date);
            System.out.println(myExpense.amount);
            System.out.println(myExpense.paymentDate);
            System.out.println(myExpense.name);


        }
    
    

    
}