package day5_ThucHanh_Overloading;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {	
		System.out.println("Luong cua Bac Si 1 la: " + Double.valueOf (TinhLuong.tinhLuong(1.3)).longValue());
		System.out.println("Luong cua Bac Si 2 la: " + Double.valueOf (TinhLuong.tinhLuong(1.3,2)).longValue());
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập loại Bác Sĩ 1_CHuyên Khoa 2_Đa Khoa ");
		int type = scan.nextInt();
		System.out.println("Luong cua bac Si 3 " + Double.valueOf (TinhLuong.tinhLuong(1.3,2,type)).longValue());
		
	}

}
