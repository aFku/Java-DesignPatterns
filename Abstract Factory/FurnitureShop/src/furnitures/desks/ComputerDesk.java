package furnitures.desks;

import furnitures.desks.exceptions.BadColorNameException;

import java.util.HashMap;

public class ComputerDesk extends BaseDesk{
    private boolean LEDsOn = false;
    private String currentColor = "Red";
    private static final HashMap<String, String> colors;
    static {
        colors = new HashMap<>();
        colors.put("Red", "Red");
        colors.put("Blue", "Blue");
        colors.put("Green", "Green");
        colors.put("Mixed", "Mixed");
    }

    public boolean getLEDsOn(){
        return LEDsOn;
    }

    public void toggleLEDs(){
        LEDsOn = !LEDsOn;
    }

    public String getCurrentColor(){
        return currentColor;
    }

    public void setCurrentColor(String key) {
        String color = colors.getOrDefault(key, null);
        if(color != null){
            currentColor = color;
        } else {
            throw new BadColorNameException();
        }
    }
}
