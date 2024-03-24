package org.rcbg.afku;

import org.rcbg.afku.verycomplicatedlib.ImageConverter;
import org.rcbg.afku.verycomplicatedlib.ImageCutter;
import org.rcbg.afku.verycomplicatedlib.VideoLoader;
import org.rcbg.afku.verycomplicatedlib.VideoSaver;

public class LibFacade {

    public String adjustVideo(String video){
        VideoLoader videoLoader = new VideoLoader();
        int videoLength = video.split(";;").length;
        String[] videoFrames = videoLoader.loadVideo(video, videoLength);
        ImageCutter imageCutter = new ImageCutter();
        ImageConverter imageConverter = new ImageConverter();
        for(int i = 0; i < videoLength; i++){
            videoFrames[i] = imageCutter.cutImage(videoFrames[i], 1080, 1920);
            videoFrames[i] = imageConverter.convertImageToGreyscale(videoFrames[i]);
        }
        VideoSaver videoSaver = new VideoSaver();
        return videoSaver.saveVideo(videoFrames);
    }

    public String cropImage(String image, int height, int width){
        ImageCutter imageCutter = new ImageCutter();
        return imageCutter.cutImage(image, height, width);
    }

    public String convertImage(String image){
        ImageConverter imageConverter = new ImageConverter();
        return imageConverter.convertImageToGreyscale(image);
    }
}
