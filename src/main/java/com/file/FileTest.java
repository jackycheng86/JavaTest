/**
 * 
 */
package com.file;

import java.io.File;

/**
 * @author Administrator
 *
 */
public class FileTest {
	
	public static void fileTest(String[] args){
		File file=new File("C:"+File.separator+"tmp"+File.separator+"test.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
	}

}
