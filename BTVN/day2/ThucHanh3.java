package day2;

import java.util.Scanner;

public class ThucHanh3 {

	public static void printLargerNumber (double number1, double number2)
	{
		if (number1 > number2)
			System.out.println(" So lon hon la: " + number1);
		else
			System.out.println(" So lon hon la: " + number2);

	}
	public static void main(String[] args) {
		double number1, number2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		number1 = scanner.nextDouble();
		
		System.out.println("Nhap so thu 2:");
		number2 = scanner.nextDouble();
		printLargerNumber(number1, number2);
	}
		

	}
	
 

