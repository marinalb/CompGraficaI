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
    HashMap<Integer, Point> frame;

    public Frame() {
       this.frame = new HashMap<>();
    }    

    public void setPos(int x, int y, int pessoa) {
       frame.put(pessoa, new Point(x,y));
    }

    public Point getPos(int pessoa) {
        
        if(frame.containsKey(pessoa)){
            return frame.get(pessoa);
        }
        return null;
    }
    
    public boolean hasPessoa(int pessoa){
        return frame.containsKey(pessoa);
    }
}
