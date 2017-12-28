package com.thread;

public class Account {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

	public Account(int balance) {
		this.balance = balance;
	}

	public void add(int num) {
		balance = balance + num;
	}

	public void withdraw(int num) {
		balance = balance - num;
	}

	/**
	 * @param args
	 */
	public static void accountTest(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1000);    
		Thread a = new Thread(new AddThread(account, 20), "add");    
		Thread b = new Thread(new WithdrawThread(account, 20), "withdraw");    
		a.start();   
		b.start();   
		try {
			a.join();
			b.join();   
			System.out.println(account.getBalance());   
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}

}
