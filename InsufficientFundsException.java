package oopj24cseb61;

public class InsufficientFundsException extends Exception {
	private String message;
	public InsufficientFundsException(String msg) {
		message = msg;
	}
	public String getMessage() {
		return message;
	}

}
