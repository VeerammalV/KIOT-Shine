package collections;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> symbol = new TreeSet<String>();
		symbol.add("!");
		symbol.add("#");
		symbol.add("@");
		symbol.add("$");
		symbol.add("*");
		symbol.add("!");
		symbol.add("&");
		System.out.println("The symbols are "+symbol);
	}

}
