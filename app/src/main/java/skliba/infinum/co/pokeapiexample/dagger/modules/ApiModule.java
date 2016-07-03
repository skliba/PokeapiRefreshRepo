package skliba.infinum.co.pokeapiexample.dagger.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import skliba.infinum.co.pokeapiexample.network.ApiService;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
@Module
public class ApiModule {

    @Provides
    @Singleton
    public ApiService provideApiService(String baseUrl, OkHttpClient okHttpClient) {

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient);

        return builder.build().create(ApiService.class);

    }
}
