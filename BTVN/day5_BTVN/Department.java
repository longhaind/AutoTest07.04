package day5_BTVN;

public class Department {
	private Employee[] employees; 
	private int n; //  Số lượng nhân viên của pb
	
	public Department(int capacity) {
        employees = new Employee[capacity];
        n = 0;
    }
	
	public void addEmployee(Employee employee) {
        employees[n] = employee;
        n++;
    }
	
	public void printEmployeeList() {
		for (int i = 0; i < n; i++) {
			System.out.println("Employee's ID: " + employees[i].getEmployee_ID() + " Employee's Name: " + employees[i].getEmployee_Name());
		}
	}

}
