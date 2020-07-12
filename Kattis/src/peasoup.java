import java.util.*;
import java.io.*;

public class peasoup {
	public static void main(String[] args) throws Exception {
		new peasoup().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int cases = Integer.parseInt(file.nextLine());
		for(int abc = 0; abc < cases; abc++) {
			int n = Integer.parseInt(file.nextLine());
			String name = file.nextLine();
			List<String> list = new ArrayList<String>();
			for(int i = 0; i < n; i++)
				list.add(file.nextLine());
			
			if(list.contains("pea soup") && list.contains("pancakes")) {
				System.out.println(name);
				return;
			}
		}
		
		System.out.println("Anywhere is fine I guess");

		file.close();
	}

}