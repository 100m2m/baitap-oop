package main.exception;

public class StudentNotExistException extends RuntimeException {

	private static final long serialVersionUID = -1768646986462924040L;
	
	public StudentNotExistException(String errorMessage) {
	    super(errorMessage);
	}
}
