package polymorphism;

public class Employee {
	public void Employeee() {
		System.out.println("Veera");
	}
	public void Employeee(int a) {
		System.out.println("Employee Id "+a);
	}
	public void Employeee(int a,float b) {
		System.out.println("Employee voterid "+a);
		System.out.println("aadhar no "+b);
	}
	public void Employeee(int a,long b,String c) {
	//	System.out.println("Employee no "+a);
		System.out.println("ph.no "+b);
		System.out.println("Loaction "+c);
	}
	public static void main(String[] args) {
		Employee v = new Employee();
		v.Employeee();
		v.Employeee(123);
		v.Employeee(1234,(float) 8.6);
		v.Employeee(1244, 38641995758484L, "Veer");
	}
}
