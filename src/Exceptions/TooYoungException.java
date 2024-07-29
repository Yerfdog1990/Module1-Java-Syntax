package Exceptions;
// Custom exception for too young error
public class TooYoungException extends Exception{
    public TooYoungException(String message){
        super(message);
    }
}
