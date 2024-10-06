/*The program is to check whether the given year is a leap year or not
 * Written by Niya Justine
 * S3 CSE B 
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class LeapYearUsingIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year (yyyy) :");
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year+" is a leap year");
		} else {
			System.out.println(year+" is not a leap year");
		}		

	}

}
