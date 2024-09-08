package exceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args) {
		try {
			String file = new String();
			file = "C://file.txt";
			FileReader filereader = new FileReader(file);
			System.out.println(filereader);
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File does not exist");
		}
	}
}
