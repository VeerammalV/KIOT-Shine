package contructor;

public class StudentDetails {
	public String studentName;
	public int studentId;
	public String department;
	
public StudentDetails(String Name,int Id,String Department) {
	studentName=Name;
	studentId=Id;
	department=Department;
}

public static void main(String[] args) {
	StudentDetails v = new StudentDetails("Veera",1065,"B.Sc");
	System.out.println(v.studentName);
	System.out.println(v.studentId);
	System.out.println(v.department);

}

}
