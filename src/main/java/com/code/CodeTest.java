/**
 * 
 */
package com.code;

/**
 * @author Administrator
 *
 */
public class CodeTest {
	
	static Character first = new Character('a');
	static Character second = new Character('A');

	/**
	 * @param args
	 * void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//  char start = a;
		 for(char start = 'a'; start<'z'; start++){
			 System.out.println(start +" = "+(int)start);
		 }
		 
		 char test='A';
		 char testtmp=(char)((int)test+1);
		 System.out.println("+"+testtmp);
		 System.out.println("\n");
		 for(char start = 'A'; start<'Z'; start++){
			 System.out.println(start +" = "+(int)start);
		 }
		 if(first.compareTo(second)==0){
			 System.out.println("equals");
		 }
		 else{
			 System.out.println("not equals");
		 }
	}

}
