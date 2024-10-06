/*The program is to find the sum of all elements in an array
 * Written by Niya Justine
 * S3 CSE B
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class SumOfElementsArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of the array :");
		int n = sc.nextInt();
		int sum = 0;
		int[] A = new int[n];
		System.out.println("Enter the elements of the array :");
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			sum = sum + A[i]; // adding each elements from the loop itself
		}
		System.out.println("The array is :");
		for (int i = 0; i < n; i++) {
			System.out.print(A[i]+"\t");
		}
		System.out.println("\nThe sum of the elements of the array is "+sum);
	}

}
