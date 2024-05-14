package btvnday4;

public class Developer {

	public static void main(String[] args) {
		Employee dev1 = new Employee();
		dev1.setEmployee_id(1);
		dev1.setEmployee_name("John Cenna");
		System.out.println("ID:" + dev1.getEmployee_id() + ", Name:" + dev1.getEmployee_name() + ", Salary: " + dev1.getEmployee_salary());
		
		Employee dev2 = new Employee();
		dev2.setEmployee_id(2);
		dev2.setEmployee_name("Mr Tee");
		System.out.println("ID:" + dev2.getEmployee_id() + ", Name:" + dev2.getEmployee_name() + ", Salary: " + dev2.getEmployee_salary());
		
		Employee dev3 = new Employee();
		dev3.setEmployee_id(3);
		dev3.setEmployee_name("May L");
		System.out.println("ID:" + dev3.getEmployee_id() + ", Name:" + dev3.getEmployee_name() + ", Salary: " + dev3.getEmployee_salary());


	}

}
// Giá trị của Salary trả về Data mặc định của trường dữ liệu khai báo là  0 hoặc null 