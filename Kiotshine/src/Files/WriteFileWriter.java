package Files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileWriter {
	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("Aspire.txt");
			file.write("Welcome to Aspire Systems");
			file.close();
			System.out.println("Writed Successfully");
		}catch(IOException e) 
		{e.printStackTrace();
		}
		}
	}


