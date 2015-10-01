package lk.cms.java8;

/**
 * 
 * @author Shazin
 *
 */
public class UnsignedArithmetic {

	public static void main(String[] args) {
		
		System.out.println(Integer.divideUnsigned(Integer.parseUnsignedInt("2147483800"),10));
		
		System.out.println(Integer.compareUnsigned(Integer.parseUnsignedInt("2147483800"),10));
		
		System.out.println(Long.remainderUnsigned(Long.parseUnsignedLong("214748380000"), 3));		
		
	}
}
