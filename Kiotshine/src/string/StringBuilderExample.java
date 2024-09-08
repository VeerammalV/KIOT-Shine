package string;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("veerammal");
		sb.append("vivacious");
		sb.insert(0,"poorani");
		System.out.println("String Index: "+sb.indexOf("veerammal"));
		System.out.println("String Index: "+sb.indexOf("poorani"));

	}
}
