import java.util.*;
import java.io.*;

public class whatdoesthefoxsay {
	public static void main(String[] args) throws Exception {
		new whatdoesthefoxsay().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int cases = Integer.parseInt(file.nextLine());
		for(int abc = 0; abc < cases; abc++) {
			List<String> list = new ArrayList<String>(Arrays.asList(file.nextLine().split(" ")));
			String s;
			List<String> others = new ArrayList<String>();
			while(!(s = file.nextLine()).contains("fox")) {
				String[] in = s.split(" ");
				others.add(in[in.length-1]);
				//System.out.println(Arrays.toString(in));
			}
			list.removeAll(others);
			//System.out.println(others);
			System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
		}
		file.close();
	}

}