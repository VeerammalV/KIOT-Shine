package collections;

import java.util.HashSet;

public class StudentidInCollections {
	public static void main(String[] args) {
		HashSet<Integer> studentid = new HashSet<Integer>();
		studentid.add(01);
		studentid.add(02);
		studentid.add(03);
		studentid.add(04);
		studentid.add(04);
		studentid.add(05);
		studentid.add(06);
		studentid.add(06);
		studentid.add(07);
		studentid.add(01);
		studentid.add(05);
		System.out.println("The student id are "+studentid);
	}

}
