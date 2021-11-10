package factories;

import furnitures.chairs.ComputerChair;
import furnitures.chairs.IChair;
import furnitures.desks.BaseDesk;
import furnitures.desks.ComputerDesk;

public class ComputerFurnitureFactory implements IFurnitureFactory{
    @Override
    public IChair createChair(){
        return new ComputerChair();
    }

    @Override
    public BaseDesk createDesk(){
        return new ComputerDesk();
    }
}
