package day5_Overloading;

public class Adder {
	// Tinh tong 2 so nguyen
	public static void add (int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	
	public static void add(double num1 , double num2 , double num3) {
		System.out.println(num1+num2+num3);
	}

}
