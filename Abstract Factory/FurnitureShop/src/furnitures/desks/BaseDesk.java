package furnitures.desks;

import furnitures.desks.exceptions.DeskAlreadyOccupiedException;
import furnitures.desks.exceptions.DeskIsEmptyException;

public abstract class BaseDesk{
    private boolean isOccupied = false;

    public void putComputerOnDesk(){
        if(!isOccupied) {
            System.out.println("You put computer on this desk");
            isOccupied = true;
        } else {
            throw new DeskAlreadyOccupiedException();
        }
    }

    public void removeComputerFromDesk(){
        if(isOccupied) {
            System.out.println("You removed computer from this desk");
            isOccupied = false;
        } else {
            throw new DeskIsEmptyException();
        }
    }

    public boolean getIsOccupied(){
        return isOccupied;
    }
}
