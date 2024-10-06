/*This program checks whether the first two characters of a given string appears at the end
 * written by Niya Justine
 * CSE B S3
 * Roll no 61 s*/
package cseb23rollno61;
import java.util.Scanner;
public class FirstTwoCharAppearsAtEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		int len = str.length();
		boolean result = ((str.charAt(0) == str.charAt(len-2)) && (str.charAt(1) == str.charAt(len-1)));
		System.out.println("The first two characters appears at the end : "+result);
	}

}
