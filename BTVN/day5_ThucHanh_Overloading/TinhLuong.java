package day5_ThucHanh_Overloading;

public class TinhLuong {
	private static int lcb = 10000000;
	public static double tinhLuong(double heSoLuong) {
		return lcb*heSoLuong; 
	}
	
	public static double tinhLuong(double heSoLuong, int namKN) {
		return lcb*heSoLuong*namKN; 
	}
	
	public static double tinhLuong(double heSoLuong, int namKN, int type) 
	{
		switch (type) {
		case 1:
			return lcb*heSoLuong*(namKN*0.2 + namKN);
		case 2:
			return lcb*heSoLuong*(namKN*0.45 +  namKN);
		default:
			return 0; 
		}	
	}

}
