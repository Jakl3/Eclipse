import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class anewalphabet {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>() {{
			put("a", "@");
			put("b", "8");
			put("c", "(");
			put("d", "|)");
			put("e", "3");
			put("f", "#");
			put("g", "6");
			put("h", "[-]");
			put("i", "|");
			put("j", "_|");
			put("k", "|<");
			put("l", "1");
			put("m", "[]\\/[]");
			put("n", "[]\\[]");
			put("o", "0");
			put("p", "|D");
			put("q", "(,)");
			put("r", "|Z");
			put("s", "$");
			put("t", "']['");
			put("u", "|_|");
			put("v", "\\/");
			put("w", "\\/\\/");
			put("x", "}{");
			put("y", "`/");
			put("z", "2");
		}};
		
		
		String[] in = file.nextLine().toLowerCase().split("");
		String out = "";
		for(String item : in) {
			if(map.containsKey(item)) out += map.get(item);
			else out += item;
		}
		System.out.println(out);

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new anewalphabet().run();
	}

}