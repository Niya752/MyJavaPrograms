package oopj24cseb61;
import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine().toLowerCase();
		int flag = 0;
		int i;
		int n = str.length();
		for (i = 0; i < n/2; i++) {
			if ((str.charAt(i)) != (str.charAt(n-i-1))) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(str+" is palindrome");
		} else {
			System.out.println(str+" is not palindrome");
		}
		

	}

}
