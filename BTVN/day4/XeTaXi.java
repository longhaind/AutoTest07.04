package day4;

public class XeTaXi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xe Taxi = new Xe();
		Taxi.setTenXe("Xe KIA");
		Taxi.setLoaiXe("4 banh");
		Taxi.setPhanKhoi(123);
		System.out.println("Ten Xe: " + Taxi.getTenXe() + ", Loai xe:" + Taxi.getLoaiXe() + ", Phan Khoi:" + Taxi.getPhanKhoi());

	}

}
