package com.infotech.client1;

public class ClientTest {

	public static void main(String[] args) {
		  MyInterface obj;
		  // Holding reference of MyClssImpl1
		  obj = new MyClassImpl1();
		  obj.display("Calling class..");
		  String result1 = obj.getValue("OOps Concept..");
		  System.out.println("Value - " + result1);
		  
		  // Holding reference of MyClssImpl2
		  obj = new MyClassImpl2();
		  obj.display("Calling class..");
		  String result2 = obj.getValue("OOps Concept..");
		  System.out.println("Value - " + result2);
	}
}
