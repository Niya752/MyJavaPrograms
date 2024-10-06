/*The program is to print the prime numbers between 1 and 100
 * Written by Niya Justine 
 * S3 CSE B
 * Roll no 61 */
package cseb23rollno61;

public class PrimeNoUsingForAndIfElse {

	public static void main(String[] args) {
		System.out.println("The prime numbers between 1 and 100 are :");

		for (int num = 2; num < 100; num++) {
			int flag = 0;
			for (int i = 2; i <= num/2; i++) {
				if (num % i == 0) {
					flag = 1;
					break;
				} 				
			}
			if (flag == 0) {
				System.out.print(num+"  ");
			}
					
		}

	}

}
