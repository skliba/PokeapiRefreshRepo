package skliba.infinum.co.pokeapiexample.mvp.view;

import skliba.infinum.co.pokeapiexample.models.Pokedex;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
public interface PokedexView extends BaseView {

    void onPokedexFetched(Pokedex pokedex);
    void onPokedexFetchError(String message);
}
