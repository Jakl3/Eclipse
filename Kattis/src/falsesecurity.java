import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class falsesecurity {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		HashMap<Character,String> engToMorse = new HashMap<Character,String>();
		engToMorse.put('a', ".-");
		engToMorse.put('b', "-...");
		engToMorse.put('c', "-.-.");
		engToMorse.put('d', "-..");
		engToMorse.put('e', ".");
		engToMorse.put('f', "..-.");
		engToMorse.put('g', "--.");
		engToMorse.put('h', "....");
		engToMorse.put('i', "..");
		engToMorse.put('j', ".---");
		engToMorse.put('k', "-.-");
		engToMorse.put('l', ".-..");
		engToMorse.put('m', "--");
		engToMorse.put('n', "-.");
		engToMorse.put('o', "---");
		engToMorse.put('p', ".--.");
		engToMorse.put('q', "--.-");
		engToMorse.put('r', ".-.");
		engToMorse.put('s', "...");
		engToMorse.put('t', "-");
		engToMorse.put('u', "..-");
		engToMorse.put('v', "...-");
		engToMorse.put('w', ".--");
		engToMorse.put('x', "-..-");
		engToMorse.put('y', "-.--");
		engToMorse.put('z', "--..");
		engToMorse.put('_', "..--");
		engToMorse.put('.', "---.");
		engToMorse.put(',', ".-.-");
		engToMorse.put('?', "----");
        
        Map<String, Character> morseToEng = new HashMap<>();
        
        for(Map.Entry<Character, String> entry : engToMorse.entrySet()){ 
        	morseToEng.put(entry.getValue(), entry.getKey());
        } 
		
		while(file.hasNext()) {
			String code = "";
			StringBuilder length = new StringBuilder();
			char[] in = file.nextLine().toLowerCase().toCharArray();
			for(int i = 0; i < in.length; i++) {
				code += engToMorse.get(in[i]);
				length.append(engToMorse.get(in[i]).length());
			}

			length.reverse();
			String lol = length.toString();
			
			
			int j = 0;
			for(int i = 0; i < lol.length(); i++) {
				code = code.substring(0,j+Integer.parseInt(lol.substring(i,i+1))) + " " + code.substring(j+Integer.parseInt(lol.substring(i,i+1)));
				j += Integer.parseInt(lol.substring(i,i+1)) + 1;
			}
			
			String[] out = code.split(" ");
			String output = "";
			for(String item : out) {
				output += morseToEng.get(item);
			}
			
			System.out.println(output.toUpperCase());
		}
	}

	public static void main(String[] args) throws Exception {
		new falsesecurity().run();
	}

}