package day5_BTVN;

public class Employee {
	private String employee_ID; 
	private String employee_Name;	
	public String getEmployee_ID() {
		return employee_ID;
	}
	public void setEmployee_ID(String employee_ID) {
		this.employee_ID = employee_ID;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}

	public Employee(String employee_ID, String employee_Name) {
        this.employee_ID = employee_ID;
        this.employee_Name = employee_Name;
    }
	
}
