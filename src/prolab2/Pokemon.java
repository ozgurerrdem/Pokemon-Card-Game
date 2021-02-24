/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2;

/**
 *
 * @author ozden
 */
public class Pokemon {
    private String pokemonID;
    private String pokemonAdı;
    private String pokemonTip;

    public String getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(String pokemonID) {
        this.pokemonID = pokemonID;
    }

    public String getPokemonAdı() {
        return pokemonAdı;
    }

    public void setPokemonAdı(String pokemonAdı) {
        this.pokemonAdı = pokemonAdı;
    }

    public String getPokemonTip() {
        return pokemonTip;
    }

    public void setPokemonTip(String pokemonTip) {
        this.pokemonTip = pokemonTip;
    }

    public Pokemon(String pokemonID, String pokemonAdı, String pokemonTip) {
        this.pokemonID = pokemonID;
        this.pokemonAdı = pokemonAdı;
        this.pokemonTip = pokemonTip;
    }

    public Pokemon() {
        this("Bilgi yok.","Bilgi yok.","Bilgi yok.");
    }

    public Pokemon(String pokemonAdı, String pokemonTip) {
        this.pokemonAdı = pokemonAdı;
        this.pokemonTip = pokemonTip;
                
    }
    
}
