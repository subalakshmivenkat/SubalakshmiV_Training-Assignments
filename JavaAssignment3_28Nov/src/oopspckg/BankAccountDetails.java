package oopspckg;

import java.util.*;

class BankAccount {
    private int accountNo;
    private int balance;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() {
        int interest = (int)(getBalance() * interestRate / 100);
        deposit(interest);
    }
}

class SalaryAccount extends BankAccount {
    private int monthlySalary;

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void creditSalary() {
        deposit(monthlySalary);
    }
}

public class BankAccountDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Savings Account Number:");
        SavingsAccount sa = new SavingsAccount();
        sa.setAccountNo(sc.nextInt());

        System.out.println("Enter Deposit Amount for Savings Account:");
        sa.deposit(sc.nextInt());

        System.out.println("Enter Interest Rate:");
        sa.setInterestRate(sc.nextDouble());

        sa.addInterest();
        System.out.println("Savings Account Balance: " + sa.getBalance());

        System.out.println("Enter Salary Account Number:");
        SalaryAccount sal = new SalaryAccount();
        sal.setAccountNo(sc.nextInt());

        System.out.println("Enter Monthly Salary:");
        sal.setMonthlySalary(sc.nextInt());

        sal.creditSalary();
        System.out.println("Salary Account Balance: " + sal.getBalance());
    }
}
