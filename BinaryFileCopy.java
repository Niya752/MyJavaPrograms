package cseb23rollno61;
import java.io.*;
public class BinaryFileCopy {

	public static void main(String[] args) throws IOException {
		try {
			File f1 = new File("source.bin");
			InputStream fin = new FileInputStream(f1);
			File f2 = new File("destation.bin");
			f2.createNewFile();
			OutputStream fout = new FileOutputStream(f2);
			int i;
			while ((i = fin.read()) != -1) {
				fout.write(i);
			}
		} catch (IOException e) {
			System.out.println("An error ocurred: "+e.getMessage());
		}
	

	}

}
