/*The program is to multiply a matrix by a scalar value
 * Written by Niya Justine
 * CSE B S3
 * Roll no 61
 * 27/07/24  */
package cseb23rollno61;
import java.util.Scanner;
public class MultiplicationByScalar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in the 2D matrix :");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns in the 2D matrix:");
		int col = sc.nextInt();
		int[][] A = new int[row][col];
		System.out.println("Enter the elements in the matrix :");
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
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
		System.out.println("Enter the scalar value to multiply with the matrix :");
		int n = sc.nextInt();
		// to multiply with the scalar
		// declare a new matrix to store the resultant values
		int[][] Result = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				Result[i][j] = n*A[i][j];	
			}
		}
		// to display the resultant matrix
		System.out.println("The resultant matrix is :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(Result[i][j]+"\t");			
			}
			System.out.print("\n");
		}
	}
	

}
