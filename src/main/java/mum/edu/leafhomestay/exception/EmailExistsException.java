package mum.edu.leafhomestay.exception;

public class EmailExistsException extends Exception {
    public EmailExistsException(String errorMessage) {
        super(errorMessage);
    }
}
