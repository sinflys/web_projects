package custom_execption.exceptions;

public class TempTooHighException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public TempTooHighException(String message) {
		super(message);
	}

}
