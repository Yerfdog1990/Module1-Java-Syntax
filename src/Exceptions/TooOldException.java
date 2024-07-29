package Exceptions;
// Custom exception for too old error
public class TooOldException extends Exception{
    public TooOldException(String message){
        super(message);
    }
}
