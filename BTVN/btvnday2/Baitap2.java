package btvnday2;

import java.util.Scanner;

public class Baitap2 {

	public static void main(String[] args) {
		int Dodai;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap do dai mang :");
		Dodai = scanner.nextInt();

		int arr[] = new int[Dodai];

		System.out.println("Nhap cac phan tu cua mang : ");
		for (int i = 0; i < Dodai ; i++) {
			System.out.println("Phan tu thu " + i  + ":");
			arr[i] = scanner.nextInt();
		}
				
		int sum,i ;
		for ( i = 0,  sum=0; i < Dodai; sum += arr[i], i++) {}
		System.out.println("Tong cac phan tu cua Mang la " + sum);
	}

}

