import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class set {
	public static void main(String[] args) throws Exception {
		new set().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		List<String> list = new ArrayList<>();
		for(int i = 0; i < 12; i++) list.add(f.next());
		//out.println(list);
		
		List<String> combos = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			for(int j = i+1; j < 11; j++) {
				for(int k = j+1; k < 12; k++) {
					if(check(list.get(i), list.get(j), list.get(k))) {
						combos.add((i+1) + " " + (j+1) + " " + (k+1));
					}
				}
			}
		}
		for(String item : combos)
			out.println(item);
		
		if(combos.size() == 0) out.println("no sets");
		
		
		///
		out.flush();
	}
	
	public boolean check(String s1, String s2, String s3) {
		int same = 0;
		int diff = 0;
		
		for(int i = 0; i < 4; i++) {
			if(s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i))
				same++;
			if(s1.charAt(i) != s2.charAt(i) && s2.charAt(i) != s3.charAt(i) && s1.charAt(i) != s3.charAt(i))
				diff++;
		}
		return same + diff == 4;
	}
	
	/*private class Combos implements Comparable<Combos> {
		int first;
		int sec;
		int third;
		public Combos(int f, int s, int t) {
			first = f;
			sec = s;
			third = t;
		}
		public int compareTo(Combos c) {
			int n = Integer.compare(this.first, c.first);
			if(n == 0) {
				n = Integer.compare(this.sec, c.sec);
				if(n == 0) {
					n = Integer.compare(this.third, c.third);
					return n;
				}
				else return n;
			}
			else return n;
		}
		public String toString() {
			return first + " " + sec + " " + third;
		}
	}*/
	
	/*private class sets {
		int num;
		char shape;
		char style;
		char color;
		public sets(String s) {
			char[] t = s.toCharArray();
			num = t[0] - '0';
			shape = t[1];
			style = t[2];
			color = t[3];
		}
		public String toString() {
			return "" + num + shape + style + color;
		}
		public boolean check(sets one, sets two) {
			boolean chkNum = false, chkShp = false, chkStyl = false, chkCol = false;
			//chkNum
			Set<Integer> chkN = new HashSet<Integer>();
			chkN.add(this.num); chkN.add(one.num); chkN.add(two.num);
			if(chkN.size() == 1 || chkN.size() == 3) chkNum = true;
			
			//chkShp
			Set<Character> chkSh = new HashSet<Character>();
			chkSh.add(this.shape); chkSh.add(one.shape); chkSh.add(two.shape);
			if(chkSh.size() == 1 || chkSh.size() == 3) chkShp = true;
			
			//chkShp
			Set<Character> chkSt = new HashSet<Character>();
			chkSt.add(this.style); chkSt.add(one.style); chkSt.add(two.style);
			if(chkSt.size() == 1 || chkSt.size() == 3) chkStyl = true;
			
			//chkShp
			Set<Character> chkC = new HashSet<Character>();
			chkC.add(this.color); chkC.add(one.color); chkC.add(two.color);
			if(chkC.size() == 1 || chkC.size() == 3) chkCol = true;
			
			return chkNum && chkShp && chkStyl && chkCol;
		}
	}*/

	///
	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}