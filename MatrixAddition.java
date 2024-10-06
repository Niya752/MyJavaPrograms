/*The program is to perform matrix addition
 * Written by Niya Justine
 * S3 CSE B
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of rows in matrix : ");
		int rowA = sc.nextInt();
		System.out.println("Enter the number of columns in matrix A: ");
		int colA = sc.nextInt();
		System.out.println("Enter the number of rows in matrix B: ");
		int rowB = sc.nextInt();
		System.out.println("Enter the number of columns in matrix B:");
		int colB = sc.nextInt();
		int[][] A = new int[rowA][colA];
		int[][] B = new int[rowB][colB];
		int[][] sum = new int[rowA][colA];
		
		// checking condition for matrix addition
		
		if ((rowA !=rowB) && (colA != colB)) {
			System.out.println("Matrix addition is not possible");
		} else {
			
			System.out.println("Enter the elements of matrix A: ");
			for (int i = 0; i < rowA; i++) {
				for (int j = 0; j < colA; j++) {
					A[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the elements of matrix B: ");
			for (int i = 0; i < rowB; i++) {
				for (int j = 0; j < colB; j++) {
					B[i][j] = sc.nextInt();
				}
			}
			
			// performing matrix addition
			
			for (int i = 0; i < rowA; i++) {
				for (int j = 0; j < colA; j++) {
					sum[i][j] = A[i][j] + B[i][j];
				}
			}
			// displaying matrix A
			System.out.println("The matrix A is :");
			for (int i = 0; i < rowA; i++) {
				for (int j = 0; j < colA; j++) {
					System.out.print(A[i][j]+"\t");
				}
				System.out.print("\n");
			}
			// displaying matrix B
			System.out.println("The matrix B is :");
			for (int i = 0; i < rowB; i++) {
				for (int j = 0; j < colB; j++) {
					System.out.print(B[i][j]+"\t");
				}
				System.out.print("\n");
			} 
			// displaying the resultant matrix
			System.out.println("The resultant matrix is ");
			for (int i = 0; i < rowA; i++) {
				for (int j = 0; j < colA; j++) {
					System.out.print(sum[i][j]+"\t");
				}
				System.out.print("\n");
			}
	
		}
		
			
	}

}
