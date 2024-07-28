package Exceptions;
// Custom exception for too young error
public class TooYoungError extends Exception{
    public TooYoungError(String message){
        super(message);
    }
}
