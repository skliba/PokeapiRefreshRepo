package skliba.infinum.co.pokeapiexample.mvp.interactor;

import skliba.infinum.co.pokeapiexample.listeners.Listener;
import skliba.infinum.co.pokeapiexample.models.Pokedex;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
public interface PokedexInteractor {

    void getPokedex(Listener<Pokedex> listener);
}
