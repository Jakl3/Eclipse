import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class kafkaesque {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int k = file.nextInt();
		
		int count = 1;
		
		int prevNum = 0;
		for(int i = 0; i < k; i++) {
			int num = file.nextInt();
			if(prevNum > num) count++;
			prevNum = num;
		}
		System.out.println(count);
		

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new kafkaesque().run();
	}

}