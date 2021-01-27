import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class warehouse {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new warehouse().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out, true);
		///
		int N = f.nextInt();
		while(N-->0) {
			Map<String,Integer> map = new HashMap<>();
			int T = f.nextInt();
			while(T-->0) {
				String name = f.next();
				int num = f.nextInt();
				
				if(!map.containsKey(name)) map.put(name, 0);
				map.put(name,map.get(name)+num);
			}
			
			List<Toy> list = new ArrayList<Toy>();
			for(String item : map.keySet()) {
				list.add(new Toy(item,map.get(item)));
			}
			Collections.sort(list);
			out.println(list.size());
			for(Toy item : list) out.println(item);
		}

		///
		f.close();
		out.flush();
	}
	
	class Toy implements Comparable<Toy> {
		String name;
		int num;
		
		public Toy(String n, int nu) {
			name = n;
			num = nu;
		}
		
		public String toString() {
			return name + " " + num;
		}
		
		public int compareTo(Toy t) {
			int temp = Integer.compare(t.num, num);
			if(temp == 0) {
				return name.compareTo(t.name);
			}
			return temp;
		}
	}

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

		public void close() throws IOException {
			reader.close();
		}
	}
}