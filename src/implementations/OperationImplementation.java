package implementations;

import interfaces.Operation;

/**
 * Class implementation of Functional Interface {@link Operation}
 * @author 4lejandroRojas
 * 
 * Form 1: Without long type. Just params. The simplest
 * Form 2: With long type.
 * Form 3: With '{}'. Needs 'return'. Not recommended
 *
 */
public class OperationImplementation {

	public static void main(String[] args) {
		//Form 1
		Operation op1 = (p1,p2) -> p1+p2; 
		System.out.println("Sum (g1): "+ op1.operationMath(10L, 20L));
		
		//Form 2
		Operation op2 = (Long p1, Long p2) -> p1+p2; 
		System.out.println("Sum (g2): "+ op2.operationMath(10L, 20L));
		
		//Form 3
		Operation op3 = (p1,p2) -> { return p1+p2;}; 
		System.out.println("Sum (g1): "+ op3.operationMath(10L, 20L));
		
	}

}
