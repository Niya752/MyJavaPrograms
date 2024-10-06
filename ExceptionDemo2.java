package Module3;
public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 100;
			if (a == 0) {
				throw new ArithmeticException("Division by Zero");
			}
			int result = b/a;
			System.out.println("Result = "+ result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Division by zero is not valid");			
		}
		System.out.println("Continuing the rest of the program");
	}

}
