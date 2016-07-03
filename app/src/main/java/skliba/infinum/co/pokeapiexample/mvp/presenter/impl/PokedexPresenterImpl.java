package skliba.infinum.co.pokeapiexample.mvp.presenter.impl;

import javax.inject.Inject;

import skliba.infinum.co.pokeapiexample.listeners.Listener;
import skliba.infinum.co.pokeapiexample.models.Pokedex;
import skliba.infinum.co.pokeapiexample.mvp.interactor.PokedexInteractor;
import skliba.infinum.co.pokeapiexample.mvp.presenter.PokedexPresenter;
import skliba.infinum.co.pokeapiexample.mvp.view.PokedexView;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
public class PokedexPresenterImpl implements PokedexPresenter {

    private PokedexInteractor pokedexInteractor;

    private PokedexView view;

    @Inject
    public PokedexPresenterImpl(PokedexInteractor pokedexInteractor, PokedexView view) {
        this.pokedexInteractor = pokedexInteractor;
        this.view = view;
    }

    @Override
    public void fetchPokedex() {
        pokedexInteractor.getPokedex(listener);
    }

    private Listener<Pokedex> listener = new Listener<Pokedex>() {
        @Override
        public void onSuccess(Pokedex pokedex) {
            view.onPokedexFetched(pokedex);
        }

        @Override
        public void onFailure(String message) {
            view.onPokedexFetchError(message);
        }
    };
}
