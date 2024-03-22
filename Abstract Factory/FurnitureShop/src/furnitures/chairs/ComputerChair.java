package furnitures.chairs;

import furnitures.chairs.exceptions.BackrestBadAngleException;

public class ComputerChair implements IChair {
    private boolean armrestsUp = false;

    public boolean areArmrestsUp(){
        return armrestsUp;
    }

    public void changeArmrestsState(){
        armrestsUp = !armrestsUp;
    }

    @Override
    public void sitOnChair(){
        System.out.println("You are sitting on chair and imagining that you are 15k software developer.");
    }
}
