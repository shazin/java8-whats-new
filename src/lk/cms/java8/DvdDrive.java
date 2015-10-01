package lk.cms.java8;

/**
 * 
 * @author Shazin
 *
 */
public interface DvdDrive {

	default void write(String s) {
		System.out.println("DVD Drive : "+s);
	}
}
