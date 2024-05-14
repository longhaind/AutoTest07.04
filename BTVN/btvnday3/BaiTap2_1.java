package btvnday3;

import java.util.Scanner;

public class BaiTap2_1 {
	public static void inputNumber(int a[]) {
		Scanner scanner = new Scanner(System.in);
		boolean tmp = false;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Nhập phần tử thứ " + i + ": ");
			a[i] = scanner.nextInt();
			if (a[i] % 2 == 0 && a[i] % 3 == 0) {
				System.out.println("Điều kiện thoát xảy ra!");
				tmp = true;
				break;
			}
		}
		if (!tmp) {
			System.out.println("Không có số nào thỏa mãn điều kiện");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		inputNumber(a);
	}
}
