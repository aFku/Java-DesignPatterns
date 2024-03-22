package furnitures.desks.exceptions;

public class DeskIsEmptyException extends RuntimeException{
    public String getMessage(){
        return "There is nothing to remove from desk";
    }
}
