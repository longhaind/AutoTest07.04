package btvnday3;

import java.util.Scanner;

public class SapXepGiamDan {
	public static void SxGiamDan (int arr[]) 
	{
		for (int t = 0; t < arr.length; t++) 
		{
			for (int i = 0; i < arr.length-1; i++) 
			{
				if (arr[i] < arr[i+1]) 
				{
					int tmp = arr[i+1];
					arr[i+1]= arr[i];
					arr[i]= tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap han tu cua mang : ");
		int n = scanner.nextInt();
		int []arr =  new int [n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap phan tu thu " + i +" ");
			arr[i]=scanner.nextInt();
		}
		SxGiamDan(arr);
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}

}
