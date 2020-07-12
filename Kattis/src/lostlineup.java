import java.util.*;

public class lostlineup {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int n = Integer.parseInt(file.nextLine());
		
		String out = "1 ";
		String[] in = file.nextLine().split(" ");
		ArrayList<Integer> original = new ArrayList<Integer>();
		ArrayList<Integer> copy = new ArrayList<Integer>();
		
		for(int i = 0; i < n-1; i++) {
			original.add(Integer.parseInt(in[i]));
			copy.add(Integer.parseInt(in[i]));
		}
		
		Collections.sort(copy);
		
		for(int i = 0; i < n-1; i++) {
			out += (original.indexOf(copy.get(i)) + 2) + " ";
		}

		System.out.println(out.trim());
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new lostlineup().run();
	}

}