package furnitures.desks.exceptions;

public class DeskAlreadyOccupiedException extends RuntimeException {

    public String getMessage(){
        return "Desk is already occupied by another computer";
    }
}
