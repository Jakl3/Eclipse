import java.util.*;
import java.io.*;

public class CF849A {
	public static void main(String[] args) throws Exception {
		new CF849A().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = Integer.parseInt(file.nextLine());
		int[] l = Arrays.stream(file.nextLine().split(" ")).mapToInt(num -> Integer.parseInt(num)).toArray();
		if(l.length % 2 == 0 || l[0] % 2 == 0 || l[n-1] % 2 == 0) {
			System.out.println("No");
		} else {
			List<Chunk> c = new ArrayList<Chunk>();
			for(int i = 0; i < n; i++) {
				int j = i;
				if(l[j] % 2 == 0) {
					while(j < n-1 && l[j+1] % 2 == 0)
						j++;
					c.add(new Chunk(i, j));
					i = j;
				}
			}
			//System.out.println(Arrays.toString(l));
			//System.out.println(c);
			
			for(int i = 0; i < c.size()-1; i++) {
				if(c.get(i+1).start - c.get(i).end < 3) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}

		file.close();
	}
	
	private class Chunk {
		int start;
		int end;
		public Chunk(int s, int e) {
			start = s;
			end = e;
		}
		public String toString() {
			return start + "->" + end;
		}
	}

}