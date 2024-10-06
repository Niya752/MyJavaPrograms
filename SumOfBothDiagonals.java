/*The program is to find the sum of both the diagonals of a square matrix
 * Written by Niya Justine
 * S3 CSE B
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class SumOfBothDiagonals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the square matrix ( n x n matrix) :");
		int n = sc.nextInt();
		int[][] A = new int[n][n];
		System.out.println("Enter the elements of the matrix :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = sc.nextInt();				
			}
		}
		// to display the matrix
		System.out.println("The matrix is :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.print("\n");
		}
		// to calculate the sum of elements in the first diagonal
		int diagonal1 = 0;
		for (int i = 0; i < n; i++) {
			diagonal1 = diagonal1 + A[i][i];		
		}
		System.out.println("The sum of the first diagonal is "+diagonal1);
		// to calculate the sum of elements in second diagonal
		int diagonal2 = 0;
		for (int i = 0; i < n; i++) {
			diagonal2 = diagonal2 + A[i][n - i - 1];
		}
		System.out.println("The sum of the second diagonal is "+diagonal2);
		// the sum of elements in both the diagonals
		System.out.println("The total sum of the diagonal is "+(diagonal1 + diagonal2));	
	}

}
