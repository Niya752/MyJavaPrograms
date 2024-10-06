package cseb23rollno61;
import java.io.*;
public class CreateFile {

	public static void main(String[] args) {
		try {
			File obj = new File("input.txt");
			if (obj.createNewFile()) {
				System.out.println("File created: "+ obj.getName());
				
			} else {
				System.out.println("File already exists");
				System.out.println("Path: "+obj.getAbsolutePath());
			}
		} catch (IOException e) {
			System.out.println("An error occured: "+e.getMessage());
		}
		
	}

}
