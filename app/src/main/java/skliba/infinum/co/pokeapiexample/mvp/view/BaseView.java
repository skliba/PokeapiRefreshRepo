package skliba.infinum.co.pokeapiexample.mvp.view;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 6/30/16
 */
public interface BaseView {

    void showProgress();

    void hideProgress();

    void showError(String error);

}
