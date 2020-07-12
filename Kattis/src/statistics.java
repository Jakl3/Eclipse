import java.util.*;
import java.io.*;

public class statistics {
	public static void main(String[] args) throws Exception {
		new statistics().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int num = 1;
		while(file.hasNext()) {
			int n = file.nextInt();
			
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < n; i++)
				list.add(file.nextInt());
			Collections.sort(list);
			int min = list.get(0), max = list.get(list.size()-1);
			System.out.printf("Case %d: %d %d %d\n", num++, min, max, max - min);
		}

		file.close();
	}

}