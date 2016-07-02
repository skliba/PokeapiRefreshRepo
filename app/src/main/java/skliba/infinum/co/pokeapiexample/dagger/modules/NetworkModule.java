package skliba.infinum.co.pokeapiexample.dagger.modules;

import dagger.Module;
import dagger.Provides;
import skliba.infinum.co.pokeapiexample.PokeApplication;
import skliba.infinum.co.pokeapiexample.network.ApiService;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
@Module
public class NetworkModule {

    @Provides
    public ApiService provideApiService() {
        return PokeApplication.getPokeApplication().getApiService();
    }
}
