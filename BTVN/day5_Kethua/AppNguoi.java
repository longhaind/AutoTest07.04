package day5_Kethua;

public class AppNguoi {

	public static void main(String[] args) {
		GiaoVien gv1 = new GiaoVien();
		gv1.maGV = "GV001";
		gv1.soGioDay = 50;
		gv1.diDay();
		gv1.diChoi();
		
		SinhVien sv1 = new SinhVien();
		sv1.maSV = "SV001";
		sv1.soTC = 100;
		sv1.diHoc();
		sv1.diChoi();

	}

}
