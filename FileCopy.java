package cseb23rollno61;
import java.io.*;
public class FileCopy {

	public static void main(String[] args) throws IOException {
		File f1 = new File("file1.txt");
		File f2 = new File("file2.txt");
		try {
			if (f1.exists()) {
				System.out.println("file1 exists");
			} else {
				System.out.println("file1 doesn't exists");
			}
			if (f2.exists()) {
				System.out.println("file2 exists");
			} else {
				System.out.println("file2 doesn't exists");
			}
			FileInputStream fin = new FileInputStream("file1.txt");
			FileOutputStream fout = new FileOutputStream("file2.txt");
			int i;
			while ((i = fin.read()) != -1) {
				fout.write(i);				
			}
			System.out.println("file contents copied from file1 to file2");	
			FileInputStream fin1 = new FileInputStream("file1.txt");
			System.out.println("** file contents of file 1**");
			int a = 0;
			while ((a = fin1.read()) != -1) {
				char c = (char)a;
				System.out.print(c);
			}
			FileInputStream fin2 = new FileInputStream("file2.txt");
			System.out.println("\n** file contents of file 2**");
			int b = 0;
			while ((b = fin2.read()) != -1) {
				char r = (char)b;
				System.out.print(r);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
