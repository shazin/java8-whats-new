package lk.cms.java8;

/**
 * 
 * @author Shazin
 *
 */
public interface NewInterface {
	
	default void print(String s) {
		System.out.println(s);
	}
	
	static boolean isNull(Object o) {
		return o == null;
	}

}
