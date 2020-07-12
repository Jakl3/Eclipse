import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class anagramcounting {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		list.add(new BigInteger("1"));
		for(int i = 1; i < 105; i++) {
			list.add(list.get(i-1).multiply(BigInteger.valueOf(i)));
		}
		
		while(file.hasNext()) {	
			String in = file.nextLine();
			BigInteger value = list.get(in.length());
			
			HashMap<String, Integer> occur = new HashMap<String, Integer>();
			for(int i = 0; i < in.length(); i++) {
				if(occur.containsKey(in.substring(i,i+1)))
					occur.replace(in.substring(i,i+1), occur.get(in.substring(i,i+1)) + 1);
				else
					occur.put(in.substring(i,i+1), 1);
			}

			for(String key : occur.keySet()) {
				value = value.divide(list.get(occur.get(key)));
			}
			
			System.out.println(value);
			
			
		}

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new anagramcounting().run();
	}
}