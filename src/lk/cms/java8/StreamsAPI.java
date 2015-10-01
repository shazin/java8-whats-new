package lk.cms.java8;

import java.util.stream.Stream;

/**
 * 
 * @author Shazin
 *
 */
public class StreamsAPI {

	public static void main(String[] args) {		
		//Imperative
		Integer[] values = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for(int i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}
		
		for(int i:values) {
			System.out.println(i);
		}
		
		Stream<Integer> intStream = Stream.of(values);
		intStream.forEach((Integer s) -> {System.out.println(s); });
		
		intStream = Stream.of(values);
		
		int total = intStream.parallel()
				.filter(i -> i % 2 == 0)
				.reduce(0, (p, c) -> p + c);
		System.out.println(total);
					
		//Declarative		
	}
}
