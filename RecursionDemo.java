package cseb23s3Rollno61;
class Factorial {
	int fact(int n) {
		int result;
		if (n==1)
			return 1;
		result = n*fact(n-1);
		return result;
	}
}
public class RecursionDemo {

	public static void main(String[] args) {
		Factorial ob = new Factorial();
		System.out.println("The factorial of 5 is "+ob.fact(5));
	}

}
