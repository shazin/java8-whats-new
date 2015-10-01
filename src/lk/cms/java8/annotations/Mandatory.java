package lk.cms.java8.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author Shazin
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(value={ElementType.TYPE_PARAMETER,ElementType.TYPE_USE,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.TYPE, ElementType.LOCAL_VARIABLE})
public @interface Mandatory {

}
