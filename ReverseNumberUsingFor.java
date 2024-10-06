/*The program is to find the reverse of a nnumber using for loop
 * Written by Niya Justine
 * S3 CSE B
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class ReverseNumberUsingFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed :");
		int num = sc.nextInt();
		System.out.println("The original number is "+num);
		int reverse = 0;
		for (int i = num; i != 0; i = i/10) {
			int reminder = i % 10;
			reverse = reverse * 10 + reminder;
		}
		System.out.println("The reversed number is "+reverse);
	}

}
