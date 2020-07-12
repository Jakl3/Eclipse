import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class addingwords {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		HashMap<String,Integer> def = new HashMap<String,Integer>();
		
		while(file.hasNext()) {

			String[] in = file.nextLine().split(" ");
			String command = in[0];
			
			if(command.equals("clear"))
				def = new HashMap<String,Integer>();
			
			if(command.equals("calc")) {
				boolean possible = true;
				
				String first = in[1];
				int curr = 0;
				if(def.containsKey(first))
					curr = def.get(first);
				else {
					for(int i = 1; i < in.length; i++) {
						System.out.print(in[i] + " ");
					}
					System.out.println("unknown");
					possible = false;
					continue;
				}
				
				
				int i = 2;
				
				while(i < in.length-1) {
					String operation = in[i];
					String variable = in[i+1];

					if(def.containsKey(variable))
						switch(operation) {
						case "+": curr+=def.get(variable); break;
						case "-": curr-=def.get(variable); break;
						}
					else {
						for(int j = 1; j < in.length; j++) {
							System.out.print(in[j] + " ");
						}
						System.out.println("unknown");
						possible = false;
						break;
					}

					i+=2;
				}
				if(possible) {
					for(int j = 1; j < in.length; j++) {
						System.out.print(in[j] + " ");
					}
					for(String item : def.keySet()) {
						if(def.get(item) == curr) {
							System.out.println(item);
							possible = false;
							break;
						}
					}
					if(possible)
						System.out.println("unknown");
				}
				
			}
			
			if(command.equals("def")) {
				String variable = in[1];
				int value = Integer.parseInt(in[2]);
				
				if(def.containsKey(variable))
					def.replace(variable, value);
				else 
					def.put(variable, value);
			}
			
		}
	}

	public static void main(String[] args) throws Exception {
		new addingwords().run();
	}

}