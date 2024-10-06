/*This program is to reverse the string
 * written by Niya Justine
 * CSE B S3
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class ReverseTheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("The original string is :"+str);
		char[] strArray = str.toCharArray();
		int len = strArray.length;
		char[] revArray = new char[len];
		for (int i = 0; i < len; i++) {
			revArray[i] = strArray[len- i - 1];
		}
		String rev = new String(revArray, 0, len);
		System.out.println("The reversed string is :"+rev);
	
	}

}
