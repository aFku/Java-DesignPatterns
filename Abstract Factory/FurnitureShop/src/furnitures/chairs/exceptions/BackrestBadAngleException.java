package furnitures.chairs.exceptions;

public class BackrestBadAngleException extends RuntimeException {
    private final float currentAngle;
    private final float maxAngle;
    private final float minAngle;


    public BackrestBadAngleException(float current, float max, float min){
        currentAngle = current;
        minAngle = min;
        maxAngle = max;
    }

    public String getMessage(){
        return "You cannot set angle " + Float.toString(currentAngle) + " to backrest! Max value is "
                + Float.toString(maxAngle) + " and Min value is " + Float.toString(minAngle);
    }

}
