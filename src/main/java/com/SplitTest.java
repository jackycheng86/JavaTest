package com;

public class SplitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="1,2,3,4";
		System.out.println(test.split(",").length);
		System.out.println(test.split(",")[1]);
		String test1="undefined,";
		System.out.println(test1.split(",").length);
	}

}
