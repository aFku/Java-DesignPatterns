package furnitures.chairs;

import furnitures.chairs.exceptions.BackrestBadAngleException;

public class ModernChair implements IChair{
    private float backrestAngle = 90.0f;
    private final static float maxAngle = 100.0f;
    private final static float minAngle = 0.0f;

    public float getBackrestAngle(){
        return backrestAngle;
    }

    public void changeBackrestAngle(float angle){
        if(angle > minAngle && angle < maxAngle){
            backrestAngle = angle;
        }else{
            throw new BackrestBadAngleException(angle, maxAngle, minAngle);
        }
    }
    @Override
    public void sitOnChair(){
        System.out.println("You are sitting on chair with fashion.");
    }
}
