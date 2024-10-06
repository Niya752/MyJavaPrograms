/*The program is to develop an identity matrix
 * Written by Niya Justine
 * CSE B S3
 * Roll no 61
 * 27/07/24 */
package cseb23rollno61;
import java.util.Scanner;
public class IdentityMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the identity matrix (n for an n x n matrix) :");
		int n = sc.nextInt();
		// declare an identity matrix
		int[][] Identity = new int[n][n];
		// conditions for an identity matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					Identity[i][j] = 1;	
				} else {
					Identity[i][j] = 0;
				}
			}
		}
		// to disply the identity matrix
		System.out.println("The identity matrix is :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(Identity[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

}
