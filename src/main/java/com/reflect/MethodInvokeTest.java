package com.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvokeTest {

	/**
	 * @param args
	 * void
	 */
	public static void methodInvodeTest(String[] args) {
		// TODO Auto-generated method stub
		Foo foo=new Foo("这是Foo对象");
		Class clazz=foo.getClass();
		try {
			Method methodSet=clazz.getDeclaredMethod("setMsg", String.class);
			Method methodGet=clazz.getDeclaredMethod("getMsg");
			Method methodOut=clazz.getDeclaredMethod("outInfo");
			methodOut.invoke(foo);
			methodSet.invoke(foo, "重置msg信息");
			methodOut.invoke(foo);
			String outInfo=(String) methodGet.invoke(foo);
			System.out.println(outInfo);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
