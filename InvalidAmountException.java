package oopj24cseb61;

public class InvalidAmountException extends Exception{
	private String message;
	public InvalidAmountException(String msg) {
		message = msg;
	}
	public String getMessage() {
		return message;
	}

}
