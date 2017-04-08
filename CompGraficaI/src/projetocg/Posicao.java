/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetocg;

/**
 *
 * @author PC
 */
public class Posicao {
    int x;
    int y;
    int time;

    public Posicao(int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }   
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getTime() {
        return time;
    }
    
    
}
