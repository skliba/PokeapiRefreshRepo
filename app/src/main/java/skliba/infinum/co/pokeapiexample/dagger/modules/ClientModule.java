package skliba.infinum.co.pokeapiexample.dagger.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
@Module
public class ClientModule {

    @Provides
    @Singleton
    public OkHttpClient provideClient() {
        return new OkHttpClient();
    }
}
