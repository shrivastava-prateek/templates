package com.psl.bean;

public class HelloWorld {
	
	private String name;
	
	public HelloWorld(){
		System.out.println("HelloWorld Object creation");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
	}
}
