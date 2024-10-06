package cseb23rollno61;
import java.io.*;
public class NumberOfLineInAFileContent {

	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			int i = 0;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
				i++;		
			}
			System.out.println("Number of lines: "+i);		
		} catch ( IOException e) {
			System.out.println("An error occured: "+e.getMessage());
		}
	}

}
