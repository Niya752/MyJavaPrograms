/*The program is to find the maximum and minimum values of an array
 * Written by Niya Justine
 * S3 CSE B
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class MaxAndMinValuesInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of the array :");
		int n = sc.nextInt();
		int[] A = new int[n];
		System.out.println("Enter the elements of the array :");
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println("The array is :");
		for (int i = 0; i < n; i++) {
			System.out.print(A[i]+"\t");
		}
		// to find the maximum element in an array
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		System.out.println("\nThe maximum element in the array is "+max);
		// to find the minimum element in an array
		int min = max;
		for (int i = 0; i < n; i++) {
			if (A[i] < min) {
				min = A[i];
			}
		}
		System.out.println("The minimum element in the array is "+min);
	}

}
