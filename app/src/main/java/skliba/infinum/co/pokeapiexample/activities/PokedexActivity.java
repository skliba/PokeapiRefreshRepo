package skliba.infinum.co.pokeapiexample.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import skliba.infinum.co.pokeapiexample.R;
import skliba.infinum.co.pokeapiexample.adapters.PokemonListAdapter;
import skliba.infinum.co.pokeapiexample.dagger.components.DaggerPokedexComponent;
import skliba.infinum.co.pokeapiexample.dagger.modules.PokedexModule;
import skliba.infinum.co.pokeapiexample.models.Pokedex;
import skliba.infinum.co.pokeapiexample.mvp.presenter.PokedexPresenter;
import skliba.infinum.co.pokeapiexample.mvp.view.PokedexView;

public class PokedexActivity extends BaseActivity implements PokedexView {

    public static final String TAG = "PokedexActivity";
    @Bind(R.id.pokemon_recycler)
    RecyclerView pokemonRecycler;

    @Inject
    PokedexPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_list);
        ButterKnife.bind(this);

        DaggerPokedexComponent.builder()
                .pokedexModule(new PokedexModule(this))
                .build()
                .inject(this);

        init();
        Log.e(TAG, "onCreate");

        this.showProgress();
        presenter.fetchPokedex();

    }

    private void init() {
        pokemonRecycler.setLayoutManager(new LinearLayoutManager(this));
    }


    @Override
    public void onPokedexFetched(Pokedex pokedex) {
        this.hideProgress();
        PokemonListAdapter adapter = new PokemonListAdapter(pokedex.getPokemonArrayList(), this);
        pokemonRecycler.setAdapter(adapter);
    }

    @Override
    public void onPokedexFetchError(String message) {
        this.hideProgress();
        this.showError(message);
    }
}
