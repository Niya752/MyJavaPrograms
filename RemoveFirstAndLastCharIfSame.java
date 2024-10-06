/*This program is to check whether the first and last characters
 * are same if so remove and print the rest
 * written by Niya Justine
 * CSE B S3
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class RemoveFirstAndLastCharIfSame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		str = str.toLowerCase();
		int len = str.length();
		if (str.charAt(0) == str.charAt(len-1)) {
			System.out.println("The first and last character are same");
			System.out.println(str.substring(1,len-1));
		} else {
			System.out.println("The first and last characters are not same");
			System.out.println(str);
		}
				
	}

}
