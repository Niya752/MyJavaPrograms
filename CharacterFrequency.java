package oopj24cseb61;
import java.util.Scanner;
public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		System.out.println("Enter the character to be searched for frequency :");
		char ch = sc.next().charAt(0);
		str = str.toLowerCase();
		int len = str.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("The frequency of the character '"+ch+"' is "+count);

	}

}
