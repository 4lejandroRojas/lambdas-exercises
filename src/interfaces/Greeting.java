package interfaces;

/**
 * Just an functional interface with greeting and one argument.
 * @author 4lejandroRojas
 *
 */
@FunctionalInterface
public interface Greeting {
	String sayHello(String name);
}
