package day4;

public class ThongTinXe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xe XeMay = new Xe();
		XeMay.setTenXe("Xe Wave");
		XeMay.setLoaiXe("2 banh");
		XeMay.setPhanKhoi(150);
		System.out.println("Ten Xe: " + XeMay.getTenXe() + ", Loai Xe: " + XeMay.getLoaiXe() + ", Dung tich : " + XeMay.getPhanKhoi() );

	}

}
