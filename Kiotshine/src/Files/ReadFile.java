package Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		try {
			File file = new File("Aspire.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String value = sc.nextLine();
				System.out.println("My topic is: "+value);
			}
			sc.close();
		}
		catch(IOException exception) {
			System.out.println("Unexcepted occur occured");
	}
}
}
