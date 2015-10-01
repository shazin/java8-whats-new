package lk.cms.java8;

/**
 * 
 * @author Shazin
 *
 */
public class LambdaExpression {

	public static void main(String[] args) throws Exception {
		// SingleAbstractMethod

		someMethod((String s) -> { System.out.println(s); });
		someMethod((s) -> { System.out.println(s); });
		someMethod(s -> { System.out.println(s); });
		someMethod(s -> System.out.println(s) );
		someMethod(System.out::println);
		
		System.out.println(someFunction((String s) -> { return "Hello, "+s; }));
		System.out.println(someFunction(s ->  "Hello, "+s ));

	}

	public static void someMethod(SingleAbstractMethod sam) throws Exception {
		sam.process("Hello World!");
	}
	
	public static String someFunction(Functional sam) {
		return sam.greet("Shazin");
	}

}
