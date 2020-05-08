package com.expenses;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private final UUID id;
    private final String name;
    private final double amount;
    private final Date paymentDate;

    protected Expense() {}

    // Expense() {
    //     this.id = generateExpenseId();  
    //     this.name = "";
    //     this.amount = 0.0;
    //     this.paymentDate = new Date();
    // }

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

    @Override
    public String toString() {
      return String.format(
          "Expense: [ID=%d, Name='%s', Amount='%s', PaymentDate='%s']",
          id, name, amount, paymentDate);
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