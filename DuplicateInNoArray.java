package cseb23s3Rollno61;
import java.util.Scanner;
public class DuplicateInNoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array is : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\nDuplicate numbers in the array is :");
		for (int i = 0; i < n; i++) {
			int currentNumber = arr[i];
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j] == currentNumber) {
					count++;
				}
			}
			if (count > 1) {
				boolean FirstOccur = true;
				for (int k = 0; k < i; k++) {
					if (arr[k] == currentNumber) {
						FirstOccur = false;
						break;
					}
				}
				if (FirstOccur) {
					System.out.println(currentNumber+" : "+count);
				}
			}
		}
		
	
	}

}
