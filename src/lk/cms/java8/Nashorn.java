package lk.cms.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * 
 * @author Shazin
 *
 */
public class Nashorn {

	public static void main(String... args) throws Throwable {
		ScriptEngineManager engineManager = new ScriptEngineManager();
		ScriptEngine engine = engineManager.getEngineByName("nashorn");
		engine.eval("function sum(a, b) { return a + b; }");
				
		System.out.println(engine.eval("print(\"The result is \" + sum(1, 2));"));
	}
}