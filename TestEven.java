package module3;
import evenpackage.Even;
import java.util.Scanner;
public class TestEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if (Even.isEven(num)) {
			System.out.println(num+" is an even number");
		} else {
			System.out.println(num+ " is an odd number");
		}
		sc.close();
	}
}
