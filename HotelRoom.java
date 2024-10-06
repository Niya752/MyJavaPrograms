/*Program written by Niya Justine
 * CSE B
 * Roll no 61 */
package Module3;
import java.util.*;
public class HotelRoom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the slot number: ");
		int slot = sc.nextInt();
		try {
			if (slot <= 0) {
				throw new InvalidReservationException("Invalid Slot number\nRegistration failed");
			} else {
				System.out.println("Your slot is registered successfully");
				System.out.println("Thank you!");
			}
		} catch(InvalidReservationException e) {
			System.out.println(e.getMessage());	
		}
	}
}
