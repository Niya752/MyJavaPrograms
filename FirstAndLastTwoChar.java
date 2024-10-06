package cseb23rollno61;
import java.util.Scanner;
public class FirstAndLastTwoChar {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string :");
	        String str = sc.nextLine();
	        int len = str.length();

	        // Check if the length of the string is at least 2
	        if (len < 2) {
	            System.out.println("The string is too short.");
	        } else {
	            // Extract the first two characters
	            String firstTwoChars = str.substring(0, 2);

	            // Extract the last two characters
	            String lastTwoChars = str.substring(len - 2, len);

	            // Check if the first two characters appear at the end
	            boolean result = lastTwoChars.equals(firstTwoChars);
	            System.out.println(result);
	
	        }

        }
  }