package org.rcbg.afku.verycomplicatedlib;

import java.util.List;

public class VideoLoader {
    public String[] loadVideo(String video, int length){
        String[] videoFrames = new String[length];
        videoFrames = video.split(";;");
        return videoFrames;
    }
}
