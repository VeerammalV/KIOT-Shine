package Files;

import java.io.File;
import java.io.IOException;

public class CreateFileName {
	public static void main(String[] args) {
	try {
		File file = new File("FileOperation.txt");
		if(file.createNewFile()) {
			System.out.println("File"+file.getName());
		}
		else {
		System.out.println("File already exits");
		
		}
	}catch(IOException exception) {
			System.out.println("Unexpected error occured");
		}
	}
}


