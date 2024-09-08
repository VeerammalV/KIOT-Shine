package collections;
import java.util.HashMap;
public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> mymap = new HashMap<Integer,String>();
		mymap.put(001, "Veera");
		mymap.put(002, "Priya");
		mymap.put(003, "Nila");
		mymap.put(004, "Sam");
		mymap.put(005, "Ram");
		System.out.println(mymap);
	}
}
