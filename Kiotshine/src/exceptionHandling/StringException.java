package exceptionHandling;

public class StringException {
	public static void main(String[] args) {
		try {
			String name = "Veera";
			name.charAt(10);
			System.out.println(name);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bound Exception is occured");
		}
	}

}
