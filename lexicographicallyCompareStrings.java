package cseb23s3Rollno61;
import java.util.Scanner;
public class lexicographicallyCompareStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string :");
		String s1 = sc.nextLine();
		System.out.println("Enter the second string : ");
		String s2 = sc.nextLine();
		int result = s1.compareTo(s2);
		if (result < 0) {
			System.out.println(s1+" is less than "+s2);
		} else if (result > 0) {
			System.out.println(s1+" is greater than "+s2);
		} else {
			System.out.println(s1+" is equal to "+s2);
		}
		


	}

}
