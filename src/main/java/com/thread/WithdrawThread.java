package com.thread;

public class WithdrawThread implements Runnable {

	private Account account;
	private int amount;

	public WithdrawThread(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100000; i++) {
			account.withdraw(amount);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
