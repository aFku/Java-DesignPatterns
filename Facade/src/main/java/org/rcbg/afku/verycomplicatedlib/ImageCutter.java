package org.rcbg.afku.verycomplicatedlib;

public class ImageCutter {

    public String cutImage(String image, int height, int width){
        System.out.println(String.format("Cutting image %s to H: %d W: %d", image, height, width));
        return image + "@";
    }
}
