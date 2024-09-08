package polymorphism;

public class CompanyDetails {
	public void Employee() {
		System.out.println("Employee parameter");
	}
	public void Employee(int a) {
		System.out.println("Integer paramter");	
	}
	public void Employee(long a) {
		System.out.println("long parameter");
	}
	public void Employee(float a) {
		System.out.println("float parameter");
	}
	public void Employee(String a) {
		System.out.println("String paramter");
	}
public static void main(String[] args) {
	CompanyDetails comdetails = new CompanyDetails();
	comdetails.Employee();
	comdetails.Employee(123);
	comdetails.Employee(123694586498543L);
	comdetails.Employee(3.14F);
	comdetails.Employee("veera");
	
	
	
	
	
	
}
}
