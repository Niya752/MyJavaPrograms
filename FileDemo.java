package module3;
import java.io.*;
import java.util.Scanner;
public class FileDemo {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String name = sc.next();
		File f = new File(name);
		f.createNewFile();
		System.out.println("File name: "+f.getName());
		System.out.println("Path: "+f.getPath());
		System.out.println("Absolute Path: "+f.getAbsolutePath());
		System.out.println("Parent: "+f.getParent());
		System.out.println("Exists: "+f.exists());
		if (f.exists()) {
			System.out.println("Is Readable: "+f.canRead());
			System.out.println("Is Writable: "+f.canWrite());
			System.out.println("Is a Directory: "+f.isDirectory());		
		}		
	}
}
