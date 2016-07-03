package skliba.infinum.co.pokeapiexample.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
public class Pokedex {

    private String name;

    @SerializedName("pokemon")
    private ArrayList<Pokemon> pokemonArrayList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pokemon> getPokemonArrayList() {
        return pokemonArrayList;
    }

    public void setPokemonArrayList(ArrayList<Pokemon> pokemonArrayList) {
        this.pokemonArrayList = pokemonArrayList;
    }
}
