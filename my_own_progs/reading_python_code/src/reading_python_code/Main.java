package reading_python_code;

import java.io.FileReader;
import java.io.StringWriter;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleScriptContext;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		String s = null;
		try {
//			Process p = Runtime.getRuntime().exec("python testing_java.py");
//			BufferedReader stdinpt = new BufferedReader(new InputStreamReader(p.getInputStream()));
//			System.out.println(stdinpt.readLine());
			StringWriter writer = new StringWriter();
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptContext contest = new SimpleScriptContext();
			contest.setWriter(writer);
			ScriptEngine engine = manager.getEngineByName("python");
			engine.eval(new FileReader("D:\\programming\\java files\\my_own_progs\\reading_python_code\\src\\reading_python_code\\testing_java.py"),contest);
			System.out.println(writer.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
