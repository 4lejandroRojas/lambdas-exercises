package implementations;

import interfaces.Greeting;

/** 
 * Class Implementation of Functional Interface {@link Greeting}
 * @author 4lejandroRojas
 * 
 * Form 1: Just define a param without '()'. The simplest
 * Form 2: Define with '()
 * Form 3: Define with String type & with '()'
 * Form 4: With '{}'. Not recommended
 * 
 */
public class GreetingImplementation {

	public static void main(String[] args) {
		//Form 1
		Greeting g1 = name -> "Hello (g1) " +name;
		System.out.println(g1.sayHello("Alex"));
		
		//Form 2
		Greeting g2 = (name) -> "Hello (g2) "+name;
		System.out.println(g2.sayHello("Alex"));
		
		//Form 3
		Greeting g3 = (String name) -> "Hello (g3) "+name;
		System.out.println(g3.sayHello("Alex"));
		
		//Form 4
		Greeting g4 = (String name) -> { return "Hello (g4) "+name;};
		System.out.println(g4.sayHello("Alex"));
	}

}
