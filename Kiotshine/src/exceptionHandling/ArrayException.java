package exceptionHandling;

public class ArrayException {
	public static void main(String[] args) {
		try {
			byte a [] = {10,20,30,40,50};
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println("Unspecified value");
		}
		catch(Exception e)
		{System.out.println("Empty");
		}
		finally
		{System.out.println("The Exception is Recovered");
		}
	}
}
