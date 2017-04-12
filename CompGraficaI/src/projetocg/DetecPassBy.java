/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocg;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class DetecPassBy {

    int range;
    ArrayList<Frame> frames;
    int prop;

    public DetecPassBy(VideoDTO video) {
        frames = video.getPositions();
        prop = video.getProportion();
    }
    
    public void analize()
    {
        for (int i = 0; i < frames.size(); i++) {
            Frame frame = frames.get(i);
            
        }
    }

    
}
