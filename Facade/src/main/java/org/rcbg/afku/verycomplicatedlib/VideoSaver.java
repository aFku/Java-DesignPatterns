package org.rcbg.afku.verycomplicatedlib;

public class VideoSaver {
    public String saveVideo(String[] frames){
        StringBuffer stringBuffer = new StringBuffer();
        for(String frame : frames){
            stringBuffer.append(frame);
            stringBuffer.append(";;");
        }
        int lastIndex = stringBuffer.length() - 1;
        stringBuffer.delete(lastIndex - 1, lastIndex);
        return stringBuffer.toString();
    }
}
