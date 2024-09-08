package org.programs;

public class FindBigNo {
	public static void main(String[] args) {
		int array[] = {10,8,11,8,23};
		{int Max = array[0];
		for (int i=0; i<array.length; ++i)
		{if (array[i]<Max) {
			Max=array[i];
		}
		}
		System.out.println(Max);
		}
	}
}
