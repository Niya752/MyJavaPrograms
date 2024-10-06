/* The program is to find the maximum element in each row of a 3D matrix
 * Written by Niya Justine
 * CSE B S3 
 * Roll no 61
 * 27/07/24  */

package cseb23rollno61;
import java.util.Scanner;
public class MaxMatrixRowElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in matrix A: ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns in ");
		int col = sc.nextInt();
		int max;
		int[][] A= new int[row][col];
		int[] MaxRow = new int[row];
		System.out.println("Enter the elements of the matrix");
		for ( int i = 0; i < row; i++) {
			for ( int j = 0; j < col; j++) {
				A[i][j] = sc.nextInt();				
			}
		}
		// to display the matrix
		System.out.println("The matrix A is:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.print("\n");
		}
		// to check for the maximum element in each rows
		for (int i = 0; i < row; i++) {
			max = A[i][0];
			for (int j = 0; j < col; j++) {
				if (A[i][j] > max) {
					max = A[i][j];
				}
			}
			MaxRow[i] = max;
		}
		// to print the maximum elements in each row in a separate array
		System.out.println("The maximum elements in each row :");
		for (int i = 0; i < row; i++) {
			System.out.println("Row "+(i+1)+" = "+MaxRow[i]);
		}
	}

}
