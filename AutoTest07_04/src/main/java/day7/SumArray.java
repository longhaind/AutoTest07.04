package day7;

import java.util.Scanner;

public class SumArray {
	
	public static int[] input() {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap do dai mang :");
		n = scanner.nextInt();
		int a[] = new int[n];

		System.out.println("Nhap cac phan tu cua mang : ");
		for (int i = 0; i < n ; i++) {
			System.out.print("Phan tu thu " + i  + ":");
			a[i] = scanner.nextInt();
		}
		return a;
	}
	
	
	public static void sumArr(int []a) {
		int sum,i ;
		for ( i = 0,  sum=0; i < a.length; sum += a[i], i++) {}
		System.out.println("Tong cac phan tu cua Mang la " + sum);
		}
	
	public static void showArr(int []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
	
	
	public static void main(String[] args) {
		int[]array = input();
		sumArr(array);
		showArr(array);

	}

}