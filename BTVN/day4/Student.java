package day4;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person studentA = new Person();
		studentA.setName("AAA");
		studentA.setAge(20);
		studentA.setPhoneNumber("0942303564");
		
		System.out.println("Ho va Ten: " + studentA.getName() + ", Tuoi: " + studentA.getAge() + ", So Dien thoai: " + studentA.getPhoneNumber());
		
		Person studentB = new Person();
		studentB.setName("ABC");
		studentB.setAge(20);
		studentB.setPhoneNumber("0942303554");
		
		System.out.println("Ho va Ten :" + studentB.getName() + ", Tuoi: " + studentB.getAge() + ", So Dien thoai: " + studentB.getPhoneNumber());

	}

}
