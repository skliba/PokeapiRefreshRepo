package skliba.infinum.co.pokeapiexample.dagger.modules;

import dagger.Module;
import dagger.Provides;
import skliba.infinum.co.pokeapiexample.mvp.interactor.PokedexInteractor;
import skliba.infinum.co.pokeapiexample.mvp.interactor.impl.PokedexInteractorImpl;
import skliba.infinum.co.pokeapiexample.mvp.presenter.PokedexPresenter;
import skliba.infinum.co.pokeapiexample.mvp.presenter.impl.PokedexPresenterImpl;
import skliba.infinum.co.pokeapiexample.mvp.view.PokedexView;

@Module
public class PokedexModule {

    private PokedexView view;

    public PokedexModule(PokedexView view) {
        this.view = view;
    }

    @Provides
    public PokedexView provideView() {
        return view;
    }


    @Provides
    public PokedexPresenter providePresenter(PokedexPresenterImpl presenter) {
        return presenter;
    }

    @Provides
    public PokedexInteractor provideInteractor(PokedexInteractorImpl interactor) {
        return interactor;
    }

}