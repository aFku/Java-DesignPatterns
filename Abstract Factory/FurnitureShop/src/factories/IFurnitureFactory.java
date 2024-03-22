package factories;

import furnitures.chairs.IChair;
import furnitures.desks.BaseDesk;

public interface IFurnitureFactory {
    public IChair createChair();
    public BaseDesk createDesk();
}
