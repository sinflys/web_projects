package custom_execption.exceptions;

public class TempTooLowException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public TempTooLowException(String message) {
		super(message);
	}

}
