package org.rcbg.afku.verycomplicatedlib;

public class ImageConverter {
    public String convertImageToGreyscale(String image){
        System.out.println(String.format("Converting image %s to greyscale", image));
        return image + "!";
    }
}
