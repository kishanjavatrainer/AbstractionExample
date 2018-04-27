package com.infotech.client1;

public class MyClassImpl1 implements MyInterface {

	@Override
	public void display(String msg) {
		System.out.println("Message is " + msg);

	}

	@Override
	public String getValue(String str) {
		return "Hello " + str;
	}
}