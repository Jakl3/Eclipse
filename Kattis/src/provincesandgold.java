import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class provincesandgold {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int buy = (file.nextInt() * 3) + (file.nextInt() * 2) + (file.nextInt() * 1);
		//System.out.println(buy);
		
		String[] cards = {"Province", "Duchy", "Estate", "Gold", "Silver", "Copper"};
		
		int[] victory = {8,5,2}, treasure = {6,3,0};
		
		String out = "";
		
		for(int i = 0; i < 3; i++) {
			if(buy >= victory[i]) {
				out+=cards[i];
				break;
			}
		}
		
		out += " or ";
		
		for(int i = 0; i < 3; i++) {
			if(buy >= treasure[i]) {
				out+=cards[i+3];
				break;
			}
		}
		
		
		System.out.println(out.substring(out.length()-2).equals("or") ? out.substring(0,out.length()-2) : out.substring(0,4).equals(" or ") ? out.substring(4) : out);
	}

	public static void main(String[] args) throws Exception {
		new provincesandgold().run();
	}

}