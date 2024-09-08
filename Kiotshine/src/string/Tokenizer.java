package string;
import java.util.StringTokenizer;
public class Tokenizer {
	public static void main(String[] args) {
	StringTokenizer st = new StringTokenizer("Welcome to Aspire Systems");
	System.out.println("The number of words in String: "+st.countTokens());
	}
}
