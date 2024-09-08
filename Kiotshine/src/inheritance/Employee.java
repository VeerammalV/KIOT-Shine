package inheritance;

public class Employee extends Student{
	public void employeeName() {
		System.out.println("The employee name is veera");
	}
	public void employeeId() {
		System.out.println("The employee id is 13478");
	}
	public void employeeDob() {
		System.out.println("The dob is 01/08/2001");
	}
	public static void main(String[] args) {
		Employee v = new Employee();
		v.studentName();
		v.studentId();
		v.studentDob();
		v.employeeName();
		v.employeeId();
		v.employeeDob();
	}
	
}

