package encapsulation;

public class VehicleInfo {
	public static void main(String[] args) {
		Registration v = new Registration();
		System.out.println("Veera");
		System.out.println(9944663388L);
		System.out.println("Vanavasi,Salem");
		System.out.println(2222777788889999L);	
		System.out.println("Honda Activa");
		System.out.println("TN52T4698");
		System.out.println(v.getName()+""+v.getPhoneNumber()+""+
		v.getLocation()+""+v.getAadharNumber()+""+v.getVehicleName()+""
		+v.getVehicleNumber());
		
	}
}
