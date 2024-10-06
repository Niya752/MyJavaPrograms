package Module3;
import java.util.Scanner;
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a: ");
			int a = sc.nextInt();
			System.out.println("Enter b: ");
			int b = sc.nextInt();
			int div = a/b;System.out.print("Result = "+div);
			sc.close();
		} catch (Exception e) {
			System.out.println("Exception thrown : "+ e);
			System.out.println(e.getMessage());
		}

		
	}

}
