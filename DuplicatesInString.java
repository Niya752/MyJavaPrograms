package cseb23s3Rollno61;
import java.util.Scanner;
public class DuplicatesInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		int len = str.length();
		System.out.println("The duplicate characters in the string :");
		for (int i = 0; i < len; i++) {
			char currentChar = str.charAt(i);
			int count  = 0;
			boolean alreadyFound = false;
			for (int k = 0; k < i; k++) {
				if (str.charAt(k) == currentChar) {
					alreadyFound = true;
					break;
				}
			}
			if (alreadyFound) {
				continue;
			}
			for (int j = 0; j < len; j++) {
				if (str.charAt(j) == currentChar) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(currentChar +" : "+count);
			}
		}
		
	}

}
