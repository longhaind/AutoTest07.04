package day5_BTVN;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Số lượng nhân viên cần nhập là : ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		Developer developer = new Developer(n);
		Tester tester = new Tester(n);
		BA ba = new BA(n);
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin nhân viên " + (i+1) + ": ");
			System.out.println("Mã nhân viên : ");
			String id = scanner.nextLine();
			System.out.println("Tên nhân viên : ");
            String name = scanner.nextLine();
            System.out.println("Department (1-developer,2-tester, 3-BA):");
            String department = scanner.nextLine();
            switch (department.toLowerCase()) {
            case "1":
                developer.addEmployee(new Employee(id, name));
                break;
            case "2":
                tester.addEmployee(new Employee(id, name));
                break;
            case "3":
                ba.addEmployee(new Employee(id, name));
                break;
            default:
                System.out.println("Không hợp lệ! ");
			}           
	}
		System.out.println("Danh sách developer là :");
        developer.printEmployeeList();

        System.out.println("Danh sách tester là :");
        tester.printEmployeeList();

        System.out.println("Danh sách BA là :");
        ba.printEmployeeList();
	}
}
