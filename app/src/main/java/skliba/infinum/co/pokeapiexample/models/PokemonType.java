package skliba.infinum.co.pokeapiexample.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
public class PokemonType {

    @SerializedName("name")
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
