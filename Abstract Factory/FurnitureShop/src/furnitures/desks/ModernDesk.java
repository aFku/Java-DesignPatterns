package furnitures.desks;

import furnitures.desks.exceptions.BadDeskHeightException;

public class ModernDesk extends BaseDesk{
    private float topHeight = 10.0f;
    private final static float maxHeight = 20.0f;
    private final static float minHeight = 0.0f;

    public void setTopHeight(float height){
        if(height > minHeight && height < maxHeight){
            topHeight = height;
        } else {
            throw new BadDeskHeightException(height, maxHeight, minHeight);
        }
    }
}
