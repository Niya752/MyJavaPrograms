/*The program is to search for an element in an array and to return its position
 * Written by Niya Justine
 * S3 CSE B
 * Roll no 61 */
package cseb23rollno61;
import java.util.Scanner;
public class SearchElementAndReturnPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in the matrix A :");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns in the matrix A :");
		int col = sc.nextInt();
		int[][] A = new int[row][col];
		System.out.println("Enter the elements of the matrix :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("The matrix A is :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.print("\n");
		}
		// enter the element to be searched in the matrix 
		System.out.println("\nEnter the element to be searched :");
		int n = sc.nextInt();
		int nRow = -1;
		int nCol = -1;
		// to search for the element
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (n == A[i][j]) {
					nRow = i;
					nCol = j;
				}
			}

		}
		if (nRow != -1 && nCol != -1) {
			System.out.println("The element "+n+" is present at the position ["+nRow+"]["+nCol+"]");
		} else {
			System.out.println("The element "+n+" is not present");
		}

	}

}
