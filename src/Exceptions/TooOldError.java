package Exceptions;
// Custom exception for too old error
public class TooOldError extends Exception{
    public TooOldError(String message){
        super(message);
    }
}
