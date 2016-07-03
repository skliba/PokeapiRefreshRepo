package skliba.infinum.co.pokeapiexample.dagger.components;

import dagger.Component;
import skliba.infinum.co.pokeapiexample.activities.PokedexActivity;
import skliba.infinum.co.pokeapiexample.dagger.modules.AppContextModule;
import skliba.infinum.co.pokeapiexample.dagger.modules.NetworkModule;
import skliba.infinum.co.pokeapiexample.dagger.modules.PokedexModule;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
@Component(modules = {
        NetworkModule.class,
        PokedexModule.class,
        AppContextModule.class
})
public interface PokedexComponent {
    void inject(PokedexActivity pokedexActivity);
}
