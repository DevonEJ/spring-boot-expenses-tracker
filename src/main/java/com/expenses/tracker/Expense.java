package com.expenses.tracker;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String name;
    private double amount;
    private Date paymentDate;

    protected Expense() {}


    Expense(String expenseName, double expenseAmount, Date paid) {
        this.name = expenseName;
        this.amount = expenseAmount;
        this.paymentDate = paid;
    }

    @Override
    public String toString() {
      return String.format(
          "Expense: [ID=%d, Name='%s', Amount='%s', PaymentDate='%s']",
          id, name, amount, paymentDate);
    }

    public long getId() {
        return id;
      }
    
      public String getName() {
        return name;
      }
    
      public double getAmount() {
        return amount;
      }

      public Date getPaymentDate() {
        return paymentDate;
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