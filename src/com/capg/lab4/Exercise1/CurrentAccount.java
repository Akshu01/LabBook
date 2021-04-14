package com.capg.lab4.Exercise1;

public class CurrentAccount extends Account {
	
	 public boolean withdraw(int amount) {
		 int overdraftLimit = 2500;
			 int newBalance = (int)(super.getBalance() - amount);
				if(newBalance>overdraftLimit) {
					super.setBalance(newBalance);
					System.out.println("Amount after withdrawl is :" +super.getBalance());
					return true;
				} else {
					System.out.println("Can't withdraw beyond limit");
					return false;
				}
	}
	 
}
