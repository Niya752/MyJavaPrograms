/* The program is write the fibonacci series upto a given limit 
 * using the while loop
 * Written by Niya Justine
 * CSE B S3
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class FibonacciUsingWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit for Fibonacci series :");
		int limit = sc.nextInt();
		int first = 0;
		int second = 1;
		int next,i = 3;
		System.out.println("The fibonacci upto "+limit+" terms is :");
		System.out.print(first+"\t"+second+"\t");
		while (i <= limit) {
			next = first + second;
			System.out.print(next+"\t");
			first = second;
			second = next;
			i++;
		}
			
	}

}
