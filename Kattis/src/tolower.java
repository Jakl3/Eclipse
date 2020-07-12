import java.util.*;
import java.io.*;

public class tolower {
	public static void main(String[] args) throws Exception {
		new tolower().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int p = file.nextInt(), t = file.nextInt();
		file.nextLine();
		
		int count = 0;
		for(int i = 0; i < p; i++) {
			List<String> list = new ArrayList<String>();
			for(int j = 0; j < t; j++) {
				StringBuilder s = new StringBuilder(file.nextLine());
				s.setCharAt(0, Character.toLowerCase(s.charAt(0)));
				list.add(s.toString());
			}
			
			boolean good = true;
			for(int j = 0; j < t; j++) {
				String s = list.get(j);
				
				int upper = 0;
				for(int k = 0; k < s.length(); k++) {
					if(Character.isUpperCase(s.charAt(k))) upper++;
				}
				if(upper > 0)
					good = false;
			}
			
			if(good) count++;
		}
		System.out.println(count);

		file.close();
	}

}