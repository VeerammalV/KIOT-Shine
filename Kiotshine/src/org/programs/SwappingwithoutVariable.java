package org.programs;

public class SwappingwithoutVariable {
	public static void main(String[] args) {
		int value1 = 10;
		int value2 = 40;
		System.out.println("before swapping");
		System.out.println("vslue1"+value1);
		System.out.println("vslue2"+value2);
		value1=value1+value2;
		value2=value1-value2;
		value1=value1-value2;
		System.out.println("after swapping");
		System.out.println("value1+"+value1);
		System.out.println("value2+"+value2);

	}

}