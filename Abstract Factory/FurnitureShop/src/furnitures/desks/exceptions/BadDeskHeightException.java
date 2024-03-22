package furnitures.desks.exceptions;

public class BadDeskHeightException extends RuntimeException {
    private final float maxHeight;
    private final float minHeight;
    private final float givenHeight;


    public BadDeskHeightException(float given, float max, float min){
        minHeight = min;
        maxHeight = max;
        givenHeight = given;
    }

    public String getMessage(){
        return "You cannot change top height to " + Float.toString(givenHeight) + "! Max value is "
                + Float.toString(maxHeight) + " and Min value is " + Float.toString(minHeight);
    }

}
