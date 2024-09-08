package Files;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File file = new File("FileOperation.txt");
		if(file.delete()) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Error occured");
		}
	}
}
