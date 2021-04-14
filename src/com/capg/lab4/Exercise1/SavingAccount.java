package com.capg.lab4.Exercise1;

public class SavingAccount extends Account {
	
	public void withdraw(double amount) {
	 
		final double minimumBalance = 500;
		double newBalance = super.getBalance() - amount;
		if(newBalance>minimumBalance) {
			super.setBalance(newBalance);
			System.out.println("Amount after withdrawl is :" +super.getBalance());
		} else
			System.out.println("Can't withdraw beyond limit");
 }
}
