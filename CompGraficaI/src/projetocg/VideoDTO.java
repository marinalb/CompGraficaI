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
public class VideoDTO {
    private int proportion;
    private ArrayList<Frame> frames;

    public VideoDTO(int proportion, ArrayList<Frame> frames) {
        this.proportion = proportion;
        this.frames = frames;
    }

    public int getProportion() {
        return proportion;
    }

    public void setProportion(int proportion) {
        this.proportion = proportion;
    }

    public ArrayList<Frame> getPositions() {
        return frames;
    }

    public void setPositions(ArrayList<Frame> frames) {
        this.frames = frames;
    }    
    
}
