/*The program is to check whether the given square matrix is an symmetric matrix
 * Written by Niya Justine
 * CSE B S3
 * Roll no 61
 * 27/05/24 */
package cseb23rollno61;
import java.util.Scanner;
public class SymmetryMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the square matrix ( n for an n x n matrix ) :");
		int n = sc.nextInt();
		int[][] A = new int[n][n];
		int flag = 0;
		// enter the elements of the matrix 
		System.out.println("Enter the elements of the matrix A:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		// to display the matrix
		System.out.println("The matrix A is :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.print("\n");
		}
		// checking whether the given matrix A is Symmetrical matrix or not
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (A[i][j] != A[j][i]) {
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println("The given matrix A is Symmetric");
		} else {
			System.out.println("The given matrix A is not Symmmetric");
		}
		
		

	}

}
