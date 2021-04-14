package com.capg.lab4.Exercise1;

public class Account {
	
	private long accNum;
	private double balance;
	Person accHolder;
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		
		double newBalance = balance + amount;
        balance = newBalance;
        System.out.println("Balance after deposit is :" +balance);
		
	}
	
	public void withdraw(double amount) {
		
		final double fixedBalance = 500;
		double newBalance = balance - amount;
		if(newBalance>fixedBalance) {
			balance = newBalance;
			System.out.println("Amount after withdrawl is :" +balance);
		} else
			System.out.println("Can't withdraw beyond limit");
	}
	
	public double getBalance() {
		return balance;
	}
	
}
