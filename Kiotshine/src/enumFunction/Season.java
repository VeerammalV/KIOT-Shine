package enumFunction;

public class Season {
	enum season{
		spring, winter, autumn, summer;
	}
public static void main(String[] args) {
	season v = season.summer;
	System.out.println(v);
}
}
