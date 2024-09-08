package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;


public class DataStreamExample {
	public static void main(String[] args) {
		try
		{
			FileInputStream fileinputstream = new FileInputStream("C:\\vs");
			int initial = 0;
			while((initial=fileInputStream.read()))
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
