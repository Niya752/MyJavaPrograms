package cseb23rollno61;
import java.io.*;
public class CreateAndWriteContent {
	
	public static void main(String[] args) throws IOException {
		String content = "This the University Exam for OODP\n"+"This is a program to illustrate the use of files";
		try {
			File f = new File("MyFile.txt");
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			fw.write(content);
			fw.flush();
			fw.close();
			FileReader fr = new FileReader(f);
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("An error occured: "+e.getMessage());
		}
	}

}
