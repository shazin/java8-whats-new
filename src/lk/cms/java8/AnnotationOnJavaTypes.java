package lk.cms.java8;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lk.cms.java8.annotations.Critical;
import lk.cms.java8.annotations.Mandatory;

/**
 * 
 * @author Shazin
 *
 */
public class AnnotationOnJavaTypes implements @Mandatory Serializable {
	
	public static void main(String[] args) {
		
		try {
			String @Mandatory [] values = args;
			
			@Mandatory List<@Mandatory String> arr = new ArrayList<String>();
			
			String name = new @Mandatory String("shazin");
			
			String no = (@Mandatory String) "1234";
			
			throw new RuntimeException();
		} catch(@Critical Exception e) {
			e.printStackTrace();
		}
	}

}
