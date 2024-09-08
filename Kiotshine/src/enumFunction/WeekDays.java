package enumFunction;

public class WeekDays {
	enum Days{
		sunday, monday, tuesday, wednesday, thursday,
		friday, saturday;
	}
public static void main(String[] args) {
	for(Days v : Days.values()) {
	System.out.println(v);
	}
}
}
