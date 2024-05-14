package btvnday3;

import java.util.Scanner;

public class BaiTap2 {
	public static void timSoHopLe(int n) {
		while (true) {
			if (n % 2 == 0 && n % 3 == 0) {
				System.out.println("Điều kiện thoát xảy ra!");
				return;
			}
			else {
				Scanner scanner = new Scanner(System.in);
				n = scanner.nextInt();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Nhập số: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		timSoHopLe(n);
	}

}
