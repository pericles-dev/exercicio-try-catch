package model.exception;

public class WithoutBalanceException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public WithoutBalanceException(String message) {
		super(message);
	}

}
