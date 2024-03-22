package factories;

import furnitures.chairs.IChair;
import furnitures.chairs.ModernChair;
import furnitures.desks.BaseDesk;
import furnitures.desks.ModernDesk;

public class ModernFurnitureFactory implements IFurnitureFactory{

    @Override
    public IChair createChair(){
        return new ModernChair();
    }

    @Override
    public BaseDesk createDesk(){
        return new ModernDesk();
    }
}
