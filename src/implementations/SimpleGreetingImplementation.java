package implementations;

import interfaces.SimpleGreeting;

/**
 * Class implementation of Functional Interface {@link SimpleGreeting}
 * @author 4lejandroRojas
 * 
 * Form 1: It's not possible avoid '()'. The simples.
 * Form 2: With '{}'. It needs to add 'return'. Not recommended.
 *
 */
public class SimpleGreetingImplementation{
	public static void main() {
		//Form 1
		SimpleGreeting sg1 = ()-> "Hello World!";
		System.out.println(sg1.say());
		
		//Form 2
		SimpleGreeting sg2 = ()-> {return "Hello World!";};
		System.out.println(sg2.say());
	}
}
