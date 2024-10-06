package cseb23rollno61;
import java.io.*;
public class DisplayStringWithLineNumber {

	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("file1.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			int i = 1;
			while ((s = br.readLine()) != null) {
				System.out.println(i+"."+s);
				i++;
			}
		} catch (IOException e) {
			System.out.println("An error occured: "+e.getMessage());
		}
	}

}
