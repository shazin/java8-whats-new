package lk.cms.java8;

/**
 * 
 * @author Shazin
 *
 */
public class Java8Interface implements NewInterface {

	public static void main(String[] args) {
		Java8Interface java8Interface = new Java8Interface();
		java8Interface.print("Shazin");
		
		System.out.println(NewInterface.isNull(null));
		System.out.println(NewInterface.isNull("Shazin"));
	}
	
}
