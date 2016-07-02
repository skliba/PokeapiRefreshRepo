package skliba.infinum.co.pokeapiexample.dagger.modules;

import android.content.Context;
import android.content.res.Resources;

import dagger.Module;
import dagger.Provides;
import skliba.infinum.co.pokeapiexample.PokeApplication;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
@Module
public class AppContextModule {

    @Provides
    public Context provideContext() {
        return PokeApplication.getPokeApplication();
    }

    @Provides
    public Resources provideResources(Context context) {
        return context.getResources();
    }
}
