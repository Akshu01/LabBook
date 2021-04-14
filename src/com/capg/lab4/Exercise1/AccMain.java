package com.capg.lab4.Exercise1;

public class AccMain {

	public static void main(String[] args) {

		Person p1 = new Person("Smith",20);
		Account acc1  = new Account();
		acc1.setAccHolder(p1);
		Person p2 = new Person("Kathy",30);
		Account acc2  = new Account();
		acc2.setAccHolder(p2);
		int nextAccoutNumber = 1 ;
		acc1.setAccNum(nextAccoutNumber++);
		acc2.setAccNum(nextAccoutNumber++);
		
		acc1.setBalance(2000);
		System.out.println("Current details of Smith acccout are :");
		System.out.println("Account Number : "+acc1.getAccNum());
		System.out.println("Account Holder's Name : " +acc1.getAccHolder().getName());
		System.out.println("Account Holder's Age : " +acc1.getAccHolder().getAge());
		System.out.println("Account Holder's Current Balance : " +acc1.getBalance());
		System.out.println("------------------------------------------------------------------");
		acc1.deposit(2000);
		System.out.println("------------------------------------------------------------------");
		System.out.println("Updated details of Smith acccout are :");
		System.out.println("Account Number : "+acc1.getAccNum());
		System.out.println("Account Holder's Name : " +acc1.getAccHolder().getName());
		System.out.println("Account Holder's Age : " +acc1.getAccHolder().getAge());
		System.out.println("Account Holder's Updated Balance : " +acc1.getBalance());
		
		acc2.setBalance(3000);
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Current details of Kathy acccout are :");
		System.out.println("Account Number : "+acc2.getAccNum());
		System.out.println("Account Holder's Name : " +acc2.getAccHolder().getName());
		System.out.println("Account Holder's Age : " +acc2.getAccHolder().getAge());
		System.out.println("Account Holder's Current Balance : " +acc2.getBalance());
		System.out.println("------------------------------------------------------------------");
		acc2.withdraw(2000);
		System.out.println("------------------------------------------------------------------");
		System.out.println("Updated details of Kathy acccout are :");
		System.out.println("Account Number : "+acc2.getAccNum());
		System.out.println("Account Holder's Name : " +acc2.getAccHolder().getName());
		System.out.println("Account Holder's Age : " +acc2.getAccHolder().getAge());
		System.out.println("Account Holder's Updated Balance : " +acc2.getBalance());
		
	}

}
