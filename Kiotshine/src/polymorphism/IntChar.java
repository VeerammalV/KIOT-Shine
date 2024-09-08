package polymorphism;

public class IntChar {
	public void main(int a,char b) {
	System.out.println("integer is "+a);
	System.out.println("character is "+b);
}
	public void main(char a,int b) {
		System.out.println("character is "+a);
		System.out.println("integer is "+b);
	}
	public static void main(String[] args) {
		IntChar v = new IntChar();
		v.main(432,'a');
		v.main('v',5867);
	}
}

