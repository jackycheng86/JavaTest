package com.string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitTest();
	}
	
	public static void SplitTest(){
		//String s="a|b|c|";
		String s="a|";
		System.out.println("***********************before**********");
		System.out.println(s);
		System.out.println("*****************replace**********");
		System.out.println(s.replace("b|", ""));
		
		
	}

}
