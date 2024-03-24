package org.rcbg.afku;

// Video is represented by <Frame 'number'>;;... String
//@ - means video was cropped
//! - means video was converted
public class Main {
    public static void main(String[] args) {
        String video = "<Frame 1>;;<Frame 2>;;<Frame 3>;;<Frame 4>;;<Frame 5>;;<Frame 6>";
        LibFacade videoLib = new LibFacade();

        // Adjust our video with prepared face
        System.out.println(String.format("Started adjusting video: %s", video));
        video = videoLib.adjustVideo(video);
        System.out.println(String.format("Adjusted video: %s", video));

        System.out.println("\n\n");

        // Crop image
        String image1 = "<Image 1>";
        System.out.println(String.format("Cropping image: %s", image1));
        image1 = videoLib.cropImage(image1, 720, 480);
        System.out.println(String.format("Image cropped: %s", image1));

        System.out.println("\n\n");

        // Image to greyscale
        String image2 = "<Image 2>";
        System.out.println(String.format("Converting image: %s", image2));
        image1 = videoLib.convertImage(image2);
        System.out.println(String.format("Image converted: %s", image2));
    }
}