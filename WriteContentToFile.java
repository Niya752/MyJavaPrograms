package cseb23rollno61;
import java.io.*;
public class WriteContentToFile {

	public static void main(String[] args) throws IOException {
		String content = "Welcome to Java world\nWelcome to File handling in java\nJava is Platform Independent";
		try {
			FileWriter fw = new FileWriter("input.txt");
			fw.write(content);
			fw.flush();
			fw.close();	
			System.out.println("Content written to the file");
		} catch (IOException e) {
			System.out.println("An error occured: "+e.getMessage());
		}

	}

}
