package skliba.infinum.co.pokeapiexample;

import android.app.Application;

import javax.inject.Inject;

import skliba.infinum.co.pokeapiexample.dagger.components.DaggerAppComponent;
import skliba.infinum.co.pokeapiexample.network.ApiService;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
public class PokeApplication extends Application {

    protected static PokeApplication pokeApplication;

    @Inject
    ApiService apiService;

    public ApiService getApiService() {
        return apiService;
    }

    public void setApiService(ApiService apiService) {
        this.apiService = apiService;
    }

    public static PokeApplication getPokeApplication() {
        return pokeApplication;
    }

    public static void setPokeApplication(PokeApplication pokeApplication) {
        PokeApplication.pokeApplication = pokeApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        setPokeApplication(this);

        DaggerAppComponent.create().inject(this);
    }
}
