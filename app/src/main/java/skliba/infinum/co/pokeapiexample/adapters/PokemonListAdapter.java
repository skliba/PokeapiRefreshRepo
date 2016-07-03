package skliba.infinum.co.pokeapiexample.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import skliba.infinum.co.pokeapiexample.R;
import skliba.infinum.co.pokeapiexample.models.Pokemon;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
public class PokemonListAdapter extends RecyclerView.Adapter<PokemonListAdapter.ViewHolder> {

    private ArrayList<Pokemon> pokemonArrayList;

    private Context context;

    public PokemonListAdapter(ArrayList<Pokemon> pokemonArrayList, Context context) {
        this.pokemonArrayList = pokemonArrayList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.pokemon_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.pokemonName.setText(pokemonArrayList.get(position).getName());

        /*holder.pokemonShortStats.setText(
                context.getString(
                        R.string.short_desc_pokemon,
                        pokemonArrayList.get(position).getHp(),
                        pokemonArrayList.get(position).getAttack()));
        String imgType = "R.drawable." + pokemonArrayList.get(position).getTypes().get(0).getTypeName();
        Glide.with(context)
                .load(imgType)
                .into(holder.typeImg);*/

    }

    @Override
    public int getItemCount() {
        return pokemonArrayList != null ? pokemonArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.type_img)
        ImageView typeImg;

        @Bind(R.id.pokemon_name)
        TextView pokemonName;

        @Bind(R.id.pokemon_short_stats)
        TextView pokemonShortStats;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
