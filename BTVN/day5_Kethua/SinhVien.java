package day5_Kethua;

public class SinhVien extends Nguoi{
	public String maSV;
	public int soTC;
	
	@Override
	public void diChoi() {
		System.out.println("Sinh vien " +maSV+ " sau khi thi xong moi di choi!");
	}
	public void diHoc() {
		System.out.println("Sinh vien "+ maSV + " hoc duoc so tin chi la: " + soTC);
	}

}
