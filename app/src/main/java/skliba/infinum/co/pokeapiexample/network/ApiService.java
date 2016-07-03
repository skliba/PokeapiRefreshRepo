package skliba.infinum.co.pokeapiexample.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import skliba.infinum.co.pokeapiexample.models.Pokedex;
import skliba.infinum.co.pokeapiexample.models.Pokemon;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
public interface ApiService {

    //api callz

    @GET("api/v1/pokedex/1")
    Call<Pokedex> getPokedex();

    @GET("api/v1/pokemon/{name}")
    Call<Pokemon> getPokemon(@Path("name") String name);
}
