/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetocg;

import java.awt.Point;
import java.util.HashMap;

/**
 *
 * @author PC
 */
public class Frame {
    HashMap<Point, Integer> frame;

    public Frame() {
       this.frame = new HashMap<>();
    }    

    public void setPos(int x, int y, int pessoa) {
       frame.put(new Point(x,y), pessoa);
    }

    public int getPos(int x, int y) {
        Point p = new Point(x, y);
        if(frame.containsKey(p)){
            return frame.get(p);
        }
        return 0;
    }
    
    public boolean hasPos(int x, int y){
        return frame.containsKey(new Point(x,y));
    }
}
