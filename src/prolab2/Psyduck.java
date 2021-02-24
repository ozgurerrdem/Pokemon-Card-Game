/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2;

import javax.swing.ImageIcon;

/**
 *
 * @author ozden
 */
public class Psyduck extends Pokemon {
     private int hasarPuani=20;
     private ImageIcon ikon=new ImageIcon("Psyduck.png");

    
    public int getHasarPuani() {
        return hasarPuani;
    }

    public ImageIcon getIkon() {
        return ikon;
    }

    public void setIkon(ImageIcon ikon) {
        this.ikon = ikon;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    public Psyduck(String pokemonAdı, String pokemonTip) {
        super(pokemonAdı, pokemonTip);
    }

    public Psyduck() {
        
    }
}
