package com.mycompany.app;

public class TestMe {
	private double value = Double.NaN;

	public static void main(String[] args) {
		System.out.println("Hello world!");
	}

	public TestMe() {}

	public double square() { return value*value; }
	public void setValue(double v) {
		value = v;
	}

	public int asciiValue() { 
		char ch = 'a';
		int ascii = ch;
		return ascii; 
	}
	public double addition() { return value+value; }
	public double modulo() { return value % (value + 1); }

}
