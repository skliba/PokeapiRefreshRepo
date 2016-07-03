package skliba.infinum.co.pokeapiexample.listeners;

/**
 * @author Skliba
 *         stefano.kliba@infinum.hr
 * @since 7/2/16
 */
public interface Listener<Type> {

    void onSuccess(Type type);

    void onFailure(String message);
}
