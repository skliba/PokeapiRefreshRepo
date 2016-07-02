package skliba.infinum.co.pokeapiexample.dagger.components;

import javax.inject.Singleton;

import dagger.Component;
import skliba.infinum.co.pokeapiexample.PokeApplication;
import skliba.infinum.co.pokeapiexample.dagger.modules.ApiModule;
import skliba.infinum.co.pokeapiexample.dagger.modules.AppContextModule;
import skliba.infinum.co.pokeapiexample.dagger.modules.CacheModule;
import skliba.infinum.co.pokeapiexample.dagger.modules.ClientModule;
import skliba.infinum.co.pokeapiexample.dagger.modules.HostModule;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
@Component(modules = {
        HostModule.class,
        AppContextModule.class,
        ApiModule.class,
        ClientModule.class,
        CacheModule.class
})
@Singleton
public interface AppComponent {

    void inject(PokeApplication pokeApplication);
}
