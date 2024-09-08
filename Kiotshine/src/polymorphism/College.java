package polymorphism;

public class College extends University{
	public void ug() {
		System.out.println("The ug is "+8504);
	}
	public void pg() {
		System.out.println("The Pg is "+1473);	
	}
	public void mphil() {
		System.out.println("The mphil is "+7454);
	}
	public static void main(String[] args) {
		College v = new College();
		v.ug();
		v.pg();
		v.mphil();
	}
}
