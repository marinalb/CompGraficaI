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
public class VideoDTO {
    private int proportion;
    private Posicao[][] positions;

    public VideoDTO(int proportion, Posicao[][] positions) {
        this.proportion = proportion;
        this.positions = positions;
    }

    public int getProportion() {
        return proportion;
    }

    public void setProportion(int proportion) {
        this.proportion = proportion;
    }

    public Posicao[][] getPositions() {
        return positions;
    }

    public void setPositions(Posicao[][] positions) {
        this.positions = positions;
    }    
    
}
