package exceptions;

public class WrongValueException extends RuntimeException{
    public String getMessage(){
        return "You typed wrong value";
    }
}
