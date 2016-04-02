package com.reflect;

public class ClassTest {

	/**
	 * @param args
	 * void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ss";
		Object b=a;
		System.out.println(b.getClass().getSimpleName());
		int c=3;
		Object d=c;
		System.out.println(d.getClass().getSimpleName());
	}

}
