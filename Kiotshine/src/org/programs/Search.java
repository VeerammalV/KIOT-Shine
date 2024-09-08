package org.programs;

public class Search {
	public static void main(String[] args) {
		int[] number = {10,8,9,11,12}; 
	int find = 11;
	boolean found = false;
	for (int n:number) {
	if(n == find) {
		found = true;
		break;
	}
	}
	if(found)
		{System.out.println(find+ " is found");
		}
	else 
	{System.out.println(find +" not found");}
}}