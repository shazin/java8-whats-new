package lk.cms.java8;

/**
 * 
 * @author Shazin
 *
 */
public interface CdDrive {

	default void write(String s) {
		System.out.println("CD Drive : " + s);
	}
}
