/**
 * 
 */
package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 *
 */
public class MapTest {

	/**
	 * @param args
	 * void
	 */
	public static void mapTest(String[] args) {
		// TODO Auto-generated method stub

		Map<String, List<String>> map=new HashMap<String, List<String>>();
		String t1="1";
		List<String> list=new ArrayList<String>();
		for(int i=1;i<10;i++){
			list.add(String.valueOf(i));
		}
		map.put(t1, list);
		List<String> l2=map.get(t1);
		l2.add("11");
		for(String s:map.get(t1)){
			System.out.println(s);
		}
	}

}
