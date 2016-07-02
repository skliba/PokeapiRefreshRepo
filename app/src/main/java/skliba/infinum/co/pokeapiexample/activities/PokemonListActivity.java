package skliba.infinum.co.pokeapiexample.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.Bind;
import butterknife.ButterKnife;
import skliba.infinum.co.pokeapiexample.R;

public class PokemonListActivity extends BaseActivity {


    @Bind(R.id.pokemon_recycler)
    RecyclerView pokemonRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_list);
        ButterKnife.bind(this);

        init();
    }

    private void init() {
        pokemonRecycler.setLayoutManager(new LinearLayoutManager(this));
    }


}
