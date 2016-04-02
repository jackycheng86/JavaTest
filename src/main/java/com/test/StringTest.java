package com.test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String datetest = "19861110";
		// toRegularTimeString(datetest);
		// String test = "test,3";
		// String[] tests = test.split(",");
		// for (String tes : tests) {
		// // System.out.println(tes);
		// }
		// List<String> testStrings = new ArrayList<String>();
		// testStrings.add("1");
		// testStrings.add("2");
		// testStrings.add("3");
		// testStrings.add("4");
		// testStrings.add("5");
		// // System.out.print(testStrings.toString());
		// replaceTest();
		// codeType();
		// Object obj = (Object) tests;
		// System.out.println(obj.getClass().getCanonicalName());
		// String s1="��� ����Ӧ���p��%";
		// System.out.println(s1.startsWith("���"));
		// if(s1.indexOf("���")>0){
		// String start3s2=s1.substring(0, 4);
		// System.out.println(start3s2);
		// }
		// //listrTest();
		//subStringTest();
//		String test="test";
//		System.out.println(test.toUpperCase());
		
		String tt="s1";
		System.out.println(tt);
		tt=t1(tt);
		System.out.println(tt);
	}
	
	
	public static String t1(String tt){
		tt="s2";
		return tt;
	}

	public static void replaceTest() {
		String a = "0%2F3";
		// String b=a.replace("%2F", "\");
		// System.out.println("replaceTest"+b);
	}

	public static String toRegularTimeString(String timestring) {
		if (timestring != null && !"".equalsIgnoreCase(timestring)) {
			String year = timestring.substring(0, 4);
			String month = timestring.substring(4, 6);
			String day = timestring.substring(6, 8);
			// System.out.println(year);
			// System.out.println(month);
			// System.out.println(day);
			return year + "-" + month + "-" + day;
		} else {
			return "";
		}
	}

	public static void codeType() {
		String from = "\327\251\273\354";
		String fromch = "砖混";
		try {
			String target = new String(fromch.getBytes());
			// System.out.println(target);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void listrTest() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("123qweqawd盛大发生地方");
		String test = "123qweqawd盛大发生地方";
		System.out.println(list.contains(test));
	}

	public static void subStringTest() {
		String t1 = "SELECT table_alias.result result FROM (SELECT tt.*, ROWNUM AS rowno FROM " +
				"(  SELECT t.cmd||t.cmd_desc result FROM WECHAT_COMMAND t " +
				"ORDER BY t.id )tt WHERE ROWNUM <=:pageMax ) table_alias WHERE table_alias.rowno >=:pageMin";
		System.out.println(t1.indexOf(":"));
		System.out.println(t1.substring(6, 8));
		String[] list;
		list=t1.split(":");
		System.out.println(list.length);
		System.out.println(list[0]);
		System.out.println(list[1]);
		System.out.println(list[2]);
		System.out.println(list[1].indexOf(" "));
		System.out.println(list[1].indexOf(")"));
		list[1]=list[1].replace("pageMax", "1");
		System.out.println(list[1]);
	}

}
