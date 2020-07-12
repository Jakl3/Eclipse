import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class keytocrypto {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String encrypted = file.nextLine();
		String key = file.nextLine();
		char[] cipher = (key + encrypted).toCharArray();
		
		int k = 0;
		for(int i = key.length(); i < cipher.length; i++) {
			int c = (cipher[i-key.length()] - 'A');
			cipher[i] = (char)( ( cipher[i] - 'A' - c < 0 ? (26) - ( c - (cipher[i] - 'A')) : cipher[i] - 'A' - c) + 'A');
			System.out.print(cipher[i]);
		}
		System.out.println();
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new keytocrypto().run();
	}

}