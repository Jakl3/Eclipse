import java.util.*;
import java.io.*;

public class evenup {
	public static void main(String[] args) throws Exception {
		new evenup().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = file.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++)
			list.add(file.nextInt());
		
		int i = 0;
		while(i < list.size()-1) {
			if( (list.get(i) + list.get(i+1)) % 2 == 0) {
				list.remove(i);
				list.remove(i);
				i = 0;
			}
			i++;
		}
		
		System.out.println(list.size());

		file.close();
	}

}