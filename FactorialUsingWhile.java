/*The program is to find the factorial of a number using while loop
 * Written by Niya Justine 
 * CSE B S3
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class FactorialUsingWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose factorial is to be calculated :");
		int n = sc.nextInt();
		int i = 1,factorial = 1;
		while (i <= n) {
			factorial = factorial * i;
			i++;	
		}
		System.out.println("The factorial of "+n+" is "+factorial);
	}

}
