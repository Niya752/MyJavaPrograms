package module3;
import java.io.*;
public class BRRead {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name:");
		String name = br.readLine();
		System.out.println("My name is "+name);
	}

}
