package org.programs;
import java.util.Scanner;
public class BiggestNumber {
	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = v.nextInt();
		if(number<=50)
		{
			System.out.println("The number is lesser than 50");
		}
		else
		{
			System.out.println("The number is greater than 50");
		}	
	}
}
