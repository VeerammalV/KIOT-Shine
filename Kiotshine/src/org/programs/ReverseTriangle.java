package org.programs;
import java.util.Scanner;
public class ReverseTriangle {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		System.out.println("Enter a Symbol");
		char c = sc.next().charAt(0);
		for (int i = number; i>0; i--);
		{
			for(int j=number-i; j>0; j--) 
			{
				System.out.println(" ");
			}
			for(int j=0; i>j ; j++);
			{
				System.out.println(c);
			}
			{System.out.println();}
		
	}

}
}

}
