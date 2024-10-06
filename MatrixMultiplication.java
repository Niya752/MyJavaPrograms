package oopj24cseb61;
import java.util.*;
public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in matrix A:");
		int row1 = sc.nextInt();
		System.out.println("Enter the number of columns in matrix A:");
		int col1 = sc.nextInt();
		System.out.println("Enter the number of rows in matrix B:");
		int row2 = sc.nextInt();
		System.out.println("Enter the number of columns in matrix B:");
		int col2 = sc.nextInt();
		int[][] A = new int[row1][col1];
		int[][] B = new int[row2][col2];
		int[][] C = new int[row1][col2];
		
		// condition to check whether multiplication is possible
		
		if (col1 != row2) {
		
		    System.out.println("Multiplication of given matrices is not possible");
		    
		    
		} else {
			System.out.println("Enter the elements of matrix A:");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					A[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the elements of matrix B:");
			for (int i = 0; i < row2; i++) {
				for (int j = 0; j < col2; j++) {
					B[i][j] = sc.nextInt();
				}
				
			}
			
			// multiplication of A and B 
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col2; j++) {
					C[i][j]=0;
					for (int k = 0; k < col1; k++) {
						C[i][j] = C[i][j]+A[i][k]*B[k][j];
					}
				}
			}
			// to display A matrix
			System.out.println("The matrix A is :");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					System.out.print(A[i][j]+"\t");
				}
				System.out.print("\n");
			}
			// to display matrix B
			System.out.println("The matrix B is :");
			for (int i = 0; i < row2; i++) {
				for (int  j = 0; j < col2; j++) {
					System.out.print(B[i][j]+"\t");
				}
				System.out.print("\n");
			}
			// the resultant matrix is 
			System.out.println("The resultant matrix C is : ");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col2; j++) {
					System.out.print(C[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}

	}

}
