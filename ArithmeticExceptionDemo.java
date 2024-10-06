package oopj24cseb61;
import java.util.Scanner;
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		do {
		    int option;
			System.out.println("\n1 Division\n");
			System.out.println("2 Array\n");
			System.out.println("Enter the option:");
			option = sc.nextInt();
			switch(option) {
			    case 1:
			    	System.out.println("Program to perfporm division");
			    	System.out.println("Enter number-1:");
			    	int a = sc.nextInt();
			    	System.out.println("Enter number-2:");
			    	int b = sc.nextInt();
			    	try {
			    		int div = a/b;
			    		System.out.println("Result = "+div);
			    		System.out.println("End of try block");
			    	} catch (ArithmeticException e) {
			    		System.out.print(e);
			    	} finally {
			    		System.out.println("\nFinally block content");
			    		System.out.println("My code is safe from exception");	
			    	}
			    	break;
			    case 2:	    	
			    	System.out.println("Enter the number of elements you want to store:");
			    	int n = sc.nextInt();
			    	int[] arr = new int[n];
			    	System.out.println("Enter the elements of the array:");
			    	for (int i=0; i<n; i++) {
			    		arr[i] = sc.nextInt();
			    	}
			    	System.out.println("Array length: "+arr.length);
			    	System.out.println("Array elements are:");
			    	for (int i=0; i<n; i++) {
			    		System.out.print(arr[i]+" ");
			    	}
			    	System.out.println("\nEnter the position of the element to be accessed");
			    	int pos = sc.nextInt();
			    	try {
			    		System.out.println("element at position "+pos+" is "+arr[pos]);
			    	} catch (ArrayIndexOutOfBoundsException e) {
			    		System.out.println("Array Index is Out Of Bound");
			    	}
			    	break;
			    default:
			    	System.out.println("Invalid option");
			    	break;
				}
			System.out.println("Do you want to continue? (y/n): ");
		    choice = sc.next();

			} while (choice.toLowerCase().equals("y"));
			  System.out.println("Exiting program.....");
}

}
