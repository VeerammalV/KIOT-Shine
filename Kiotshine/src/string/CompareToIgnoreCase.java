package string;

public class CompareToIgnoreCase {
	public static void main(String[] args) {
		String str1 = "Veera";
		String str2 = "Veerammmal";
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str2.compareTo(str1));
		char[] v = {'v','e','e','r'};
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.copyValueOf(v,0,3));
		System.out.println(str1.endsWith("er"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));	
	}
}
