/*Program by Niya Justine
 * CSE B S3
 * Roll no 61  */
package Module3;
import java.util.*;
public class SumAndAverage {
    public static int add(int arr[], int n) throws InvalidNumberException {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                throw new InvalidNumberException("Invalid number " + arr[i]);
            }
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int count = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The numbers are: ");
        for (int i = 0; i < n; i++) {
            try {
                if (arr[i] > 0) {
                    System.out.println(arr[i]);
                    sum = sum + arr[i];
                    count++;
                } else {
                    throw new InvalidNumberException("Invalid number " + arr[i]);
                }
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        if (count > 0) {
            System.out.println("The sum of the positive numbers is: " + sum);
            System.out.println("The average is: " + ((double) sum / count));
        } 
    }
}
