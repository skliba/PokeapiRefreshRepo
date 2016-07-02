package skliba.infinum.co.pokeapiexample.dagger.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
@Module
public class HostModule {

    @Provides
    @Singleton
    public String provideBaseUrl() {
        return "http://pokeapi.co/";
    }
}
