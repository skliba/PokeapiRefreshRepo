package skliba.infinum.co.pokeapiexample.mvp.interactor.impl;

import android.content.Context;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;
import skliba.infinum.co.pokeapiexample.listeners.Listener;
import skliba.infinum.co.pokeapiexample.models.Pokedex;
import skliba.infinum.co.pokeapiexample.mvp.interactor.PokedexInteractor;
import skliba.infinum.co.pokeapiexample.network.ApiService;
import skliba.infinum.co.pokeapiexample.network.BaseCallback;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
public class PokedexInteractorImpl implements PokedexInteractor {

    private ApiService apiService;

    private Context context;

    private BaseCallback<Pokedex> callback;

    private Call<Pokedex> call;


    @Inject
    public PokedexInteractorImpl(ApiService apiService, Context context) {
        this.apiService = apiService;
        this.context = context;
    }

    @Override
    public void getPokedex(final Listener<Pokedex> listener) {
        call = apiService.getPokedex();
        callback = new BaseCallback<Pokedex>() {
            @Override
            public void onSuccess(Pokedex body, Response<Pokedex> response) {
                listener.onSuccess(body);
            }

            @Override
            public void onUnknownError(@Nullable String error) {
                listener.onFailure(error);
            }
        };

        call.enqueue(callback);
    }


}
