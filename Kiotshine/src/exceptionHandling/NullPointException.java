package exceptionHandling;

public class NullPointException {
	public static void main(String[] args) {
		try {
		String a = null;
		System.out.println(a.charAt(4));
		}
		catch(NullPointerException e) {
			{System.out.println("Null Exception is occured");}
		}
	}
}
