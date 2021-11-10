import factories.IFurnitureFactory;
import furnitures.chairs.IChair;
import furnitures.desks.BaseDesk;

public class Client {
    private final IFurnitureFactory factory;
    private BaseDesk desk;
    private IChair chair;

    public Client(IFurnitureFactory f){
        factory = f;
        createNewChair();
        createNewDesk();
    }

    public void createNewChair(){
        chair = factory.createChair();
    }

    public void createNewDesk(){
        desk = factory.createDesk();
    }

    public void sitOnClientChair(){
        chair.sitOnChair();
    }

    public void putComputerOnClientDesk(){
        desk.putComputerOnDesk();
    }

    public void removeComputerFromClientDesk(){
        desk.removeComputerFromDesk();
    }
}
