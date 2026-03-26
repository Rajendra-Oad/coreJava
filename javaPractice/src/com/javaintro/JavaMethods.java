package com.javaintro;

public class JavaMethods {
	static JavaMethods j = new JavaMethods();
	
	static void staticMethod() {
		j.instaceMethod();
		System.out.println("Static Method");
	}
	
	void main1() {
		main2();
		System.out.println("main1");
	}
	static void main2() {
		System.out.println("main2");
		j.main3();
	}
	void main3() {
		main1();
		System.out.println("main3");
	}
	
	void instaceMethod() {
		main1();
		System.out.println("Instance Method");
	}

	public static void main(String[] args) {
		staticMethod();

	}

}
