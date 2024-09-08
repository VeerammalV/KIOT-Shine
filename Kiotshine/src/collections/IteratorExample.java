package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		mylist.add(200);
		mylist.add(100);
		mylist.add(500);
		mylist.add(300);
		mylist.add(300);
		mylist.add(600);
		mylist.add(800);
		Iterator<Integer> myIterator = mylist.iterator();
		while(myIterator.hasNext()==true)
		{
			int element = myIterator.next();
			System.out.println("Element are: "+element);
		}
	}
}
