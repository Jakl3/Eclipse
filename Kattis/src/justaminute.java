import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class justaminute {
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int numbers = Integer.parseInt(file.readLine());
		double m = 0, s = 0;
		
		for(int i = 0; i < numbers; i++) {
			StringTokenizer st = new StringTokenizer(file.readLine());
			m += Integer.parseInt(st.nextToken());
			s += Integer.parseInt(st.nextToken());
		}
		
		System.out.println( (s / (m*60)) <= 1 ? "measurement error" : s / (m*60));

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new justaminute().run();
	}

}