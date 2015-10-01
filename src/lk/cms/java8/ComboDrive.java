package lk.cms.java8;

/**
 * 
 * @author Shazin
 *
 */
public class ComboDrive implements CdDrive, DvdDrive {
	
	public void write(String s) {
		CdDrive.super.write(s);
		DvdDrive.super.write(s);
		System.out.println("ComboDrive : "+s);
	}

	public static void main(String[] args) {
		new ComboDrive().write("Shazin");
	}
}
