import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class oddgnome {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			int gnome = file.nextInt();
			int[] gnomes = new int[gnome];
			for(int i = 0; i < gnome; i++) {
				gnomes[i] = file.nextInt();
			}
			
			for(int i = 1; i < gnome; i++) {
				if(gnomes[i] - gnomes[i-1] != 1) {
					System.out.println(i+1);
					break;
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new oddgnome().run();
	}

}