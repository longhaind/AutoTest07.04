package btvnday3;

import java.util.Scanner;

public class BaiTap3_2 {
	public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        int minVl = min(arr);
        int maxVl = max(arr);
        System.out.println("Phần tử nhỏ nhất của mảng là: " + minVl);
        System.out.println("Phần tử lớn nhất của mảng là: " + maxVl);
	}

}
