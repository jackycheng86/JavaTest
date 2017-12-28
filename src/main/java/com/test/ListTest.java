/**
 * 2016年1月23日   jacky
 */
package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jacky
 *
 */
public class ListTest {

	/**
	 * @param args
	 * void
	 */
	public static void listTest(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		System.out.println("before***********************");
		for(String a:list){
			System.out.println(a);
			a="ds";
		}
		System.out.println("after*************************");
		for(String a:list){
			System.out.println(a);
		}
	}

}
