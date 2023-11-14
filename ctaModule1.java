package package1;
//Brian Phipps
//CS 372 Dr. George
//Critical Thinking Module 1 Option 2
public class ctaModule1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee test = new Employee ("Bob", "Smith", 1356, 300.50);
		test.employeeSummary();
		
		Manager test2 = new Manager ("Brian", "Phipps", 1220, 350.67, "Produce");
		test2.employeeSummary();
	}//end of main

}
class Employee {
	
	private String firstName;
	private String lastName;
	private int employeeID;
	private double salary;
	
	//constructor
	public Employee(String firstName, String lastName, int employeeID, double salary) {
	 this.firstName = firstName;
	 this.lastName = lastName;
	 this.employeeID = employeeID;
	 this.salary = salary;
	}
	
	//getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	public double getSalary() {
		return salary;
	}
	
	
	//setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmployeeID (int employeeID) {
		this.employeeID = employeeID;
	}
	
	public void setSalary (double salary) {
		this.salary = salary;
	}
	
	public void employeeSummary () {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Salary: $" + salary);
	}
	
}//end of class Employee

class Manager extends Employee {
	private String department;
	
	public Manager (String firstName, String lastName, int employeeID, double salary, String department) {
		
		super (firstName, lastName, employeeID, salary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void employeeSummary() {
		System.out.println("Name: " + getFirstName() + " " + getLastName());
		System.out.println("Employee ID: " + getEmployeeID());
		System.out.println("Salary: $" + getSalary());
		System.out.println("Department: " + department);
		
	}
	
}//end of Manager class