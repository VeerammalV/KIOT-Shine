package collections;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		int size = 5;
		Vector<Integer> value = new Vector<Integer>();
		for(int initial = 1; initial<=size; initial++) {
			value.add(initial);
			System.out.println("Values are "+value);
		}
		//Remove value
		value.remove(3);
		System.out.println("After remove "+value);
		//Update value
		System.out.println("Upadte"+value.set(1,4));
		System.out.println("Updated values are "+value);
		
	}

}
