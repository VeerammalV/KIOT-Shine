package Files;

import java.io.File;

public class GetFileInformationExample {
	public static void main(String[] args) {
		File file = new File("FileOperation.txt");
		if(file.exists()) {
			System.out.println("File Name:"+file.getName());
			System.out.println("Path is:"+file.getAbsolutePath());
			
		}
	}

}
