import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class icpcawards {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
		
		while(times-- > 0 && map.size() < 12) {
			String[] in = file.nextLine().split(" ");
			if(!map.containsKey(in[0])) map.put(in[0], in[1]);
			
		}
		System.out.println();
		System.out.println(map.toString().replaceAll("[{}]", "").replaceAll("=", " ").replaceAll(", ", "\n"));
	}

	public static void main(String[] args) throws Exception {
		new icpcawards().run();
	}

}