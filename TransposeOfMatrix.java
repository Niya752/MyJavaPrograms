/*The program is to find the transpose of a given matrix
 * Written by Niya Justine
 * S3 CSE B 
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class TransposeOfMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in the matrix :");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns in the matrix :");
		int col = sc.nextInt();
		int[][] A= new int[row][col];
		int[][] trans = new int[row][col];
		System.out.println("Enter the elements of the matrix :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				A[i][j] = sc.nextInt();				
			}
		}
		// transpose
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				trans[i][j] = A[j][i];
			}
		}
		System.out.println("The matrix A is :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.print("\n");
		}
		// displaying the transpose matrix
		System.out.println("\nThe transpose of a matrix :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(trans[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
	}

}
