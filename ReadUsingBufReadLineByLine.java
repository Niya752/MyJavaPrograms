package module3;
import java.io.*;
public class ReadUsingBufReadLineByLine {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fin = new FileInputStream("test.txt");
			InputStreamReader isr = new InputStreamReader(fin);
			BufferedReader br = new BufferedReader(isr);
			String line;
			int totalChar = 0;
			while ((line = br.readLine()) != null) {
				System.out.print(line);
				totalChar = line.length();
			}
			System.out.println("\nTotal characters: "+totalChar);
		} catch (IOException e) {
			System.out.println("File not found: "+e.getMessage());
		}
	}
}
