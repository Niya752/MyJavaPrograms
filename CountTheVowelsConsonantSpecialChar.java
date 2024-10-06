/*This program is to count the total no. of characters, words, lines, 
 * alphabets, digits and white spaces
 * written by Niya Justine
 * CSE B S3
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class CountTheVowelsConsonantSpecialChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		System.out.println("The string is :"+str);
		str = str.toLowerCase();
		int len = str.length();
		int chars = 0, words = 0;
		int line = 1, alpha = 0;
		int digit = 0, space = 0;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				alpha++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				digit++;
			} else if (str.charAt(i) == ' ') {
				space++;
			} else if (str.charAt(i) == '\n') {
				line++;
			}
			if (str.charAt(i) == ' ' || str.charAt(i) == '.') {
				words++;
			}
			
		}
			System.out.println("The number of characters is "+len);
			System.out.println("The number of words is "+(words+1));
			System.out.println("The number of alphabets is "+alpha);
			System.out.println("The number of lines is "+line);
			System.out.println("The number of whitespace is "+space);
			System.out.println("The number of digits is "+digit);
		
		
	}

}
