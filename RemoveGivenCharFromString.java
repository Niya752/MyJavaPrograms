/*The program is to remove a given character from the string
 * written by Niya Justine
 * CSE B S3
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class RemoveGivenCharFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the original string : ");
		String OriStr = sc.nextLine();
		System.out.println("Enter the character to remove : ");
		char charToRemove = sc.nextLine().charAt(0);
		char[] charArray = OriStr.toCharArray();
		int len = charArray.length;
		char[] ResultantArray = new char[len];
		int index = 0;
		for (int i = 0; i < len; i++) {
			if (charArray[i] != charToRemove) {
				ResultantArray[index] = charArray[i];
				index++;
			}
		}
		String ResultantStr = new String(ResultantArray, 0, index);
		System.out.println("Original String : "+OriStr);
		System.out.println("The Resultant String is : "+ResultantStr);
		
	}

}
