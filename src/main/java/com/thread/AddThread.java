package com.thread;

public class AddThread implements Runnable {

	private Account account;
	int amount;

	public AddThread(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 200000; i++) {
			account.add(amount);
		}
	}

	/**
	 * @param args
	 */
	public static void addThreadTest(String[] args) {
		// TODO Auto-generated method stub

	}

}
