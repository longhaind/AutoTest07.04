package day4;

public class MotorBike 
{
	String hangXe ;
	String mauXe ; 
	String bienSo ;
	String ngayDK ;
	
	public String getInformation()
	{
		return "Hang Xe la :"+ hangXe + "Mau xe la" + mauXe + "Bien so la:" + bienSo + "Ngay dang ki :" + ngayDK ;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike wave = new MotorBike();
		wave.hangXe ="Honda";
		wave.mauXe = "Trang";
		wave.bienSo = "18B1-80210";
		wave.ngayDK = "20/12/2012";
		System.out.println(wave.getInformation());

	}

}
