package module3;
import java.io.*;
public class InputStrReadCharByChar {
	public static void main(String[] args) throws IOException {
		int i=0;
		try {
			FileInputStream fin = new FileInputStream("test.txt");
			System.out.println(fin.available());
			while ((i = fin.read()) != -1) {
				char c = (char)i;
				System.out.print(c);
			}
		} catch (IOException e) {
			System.out.println("File not Found");
		}
	}
}
