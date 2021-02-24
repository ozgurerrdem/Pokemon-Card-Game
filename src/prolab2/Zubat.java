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
public class Zubat extends Pokemon {

    private int hasarPuani = 50;
    private ImageIcon ikon = new ImageIcon("Zubat.png");

    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    public Zubat(String pokemonAdı, String pokemonTip) {
        super(pokemonAdı, pokemonTip);
    }

    public ImageIcon getIkon() {
        return ikon;
    }

    public void setIkon(ImageIcon ikon) {
        this.ikon = ikon;
    }

    public Zubat() {

    }
}
