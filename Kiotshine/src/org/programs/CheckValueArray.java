package org.programs;

import java.util.Arrays;

private static void check(int[] arr, int toCheckValue) {
	// TODO Auto-generated method stub
	boolean test = false;
	for(int element : arr) {
		if(element == toCheckValue) {
			test=true;
			break;
		
}
}
public class CheckValueArray {
	public static void main(String[] args) {
		int arr[] = {10,8,9,11,12};
		int toCheckValue=11;
		System.out.println("Array: "+Arrays.toString(arr));
		check(arr, toCheckValue);
	}


}
}

