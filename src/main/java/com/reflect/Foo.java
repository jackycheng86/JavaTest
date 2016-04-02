package com.reflect;

public class Foo {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void outInfo(){
		System.out.println("Javatest");
	}

	public Foo(String msg) {
		this.msg = msg;
	}
}
	