 package org.programs;
import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		System.out.println("Enter the values of x and y");
		Scanner v=new Scanner(System.in);
		int x = v.nextInt();
		int y = v.nextInt();
		System.out.println("Before swapping:" + x + " " + y );
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping:"+x+" "+y);
		
		
	}

}
