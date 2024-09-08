package contructor;

public class EmployeeDetails {
	public String EmployeeName;
	public int EmployeeId;
	public String MailId;
	
public EmployeeDetails(String Name,int Id,String Mailaddress) {
	EmployeeName=Name;
	EmployeeId=Id;
	MailId=Mailaddress;
}

public static void main(String[] args) {
	EmployeeDetails v = new EmployeeDetails("Veera",1839,"abc@gmail.com");
	System.out.println(v.EmployeeName);
	System.out.println(v.EmployeeId);
	System.out.println(v.MailId);
}
}
