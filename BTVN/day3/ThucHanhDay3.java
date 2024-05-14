package day3;
import java.util.Scanner;

public class ThucHanhDay3 {
	public static void inSoLonHon(int num1, int num2)
	{
	int result =  num1>num2 ? num1:num2 ;
	System.out.println("So lon hon la" + result);
	}
	
	public static void inSoChan() {
		for (int i =0; i<=100; i +=2)
		{
			System.out.print(i + " ");
	    }
	}
	
	public int comppareNumber(int x, int y) {
		if (x>y)
			return x;
		else
			return y;
	
	}
	
//	public static void soChanLe(int num)
//	{
//		String result =  (num % 2 == 0)? num + "So chan": num + "So le";
//		System.out.println("\n" + result);
//	}
	public static void main(String[] args) {
//		int number1,number2;
//		Scanner  scanner = new Scanner(System.in);
//		System.out.println("Nhap so thu nhat: ");
//		int num1 = scanner.nextInt();
//		System.out.println("Nhap so thu hai: ");
//		int num2 = scanner.nextInt();
//		inSoLonHon(num1,num2);
//		soChanLe(num1);
		inSoChan();
	
	}

}
   

