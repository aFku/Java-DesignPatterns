package furnitures.desks.exceptions;

public class BadColorNameException extends RuntimeException{

    @Override
    public String getMessage(){
        return "You cannot chose this color!";
    }
}
