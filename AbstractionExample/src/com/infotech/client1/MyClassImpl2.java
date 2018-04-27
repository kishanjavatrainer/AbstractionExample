package com.infotech.client1;

public class MyClassImpl2 implements MyInterface {

	@Override
	public void display(String msg) {
		System.out.println("Message in Uppercase " + msg.toUpperCase());
	}

	@Override
	public String getValue(String str) {
		return str.toUpperCase();
	}
}