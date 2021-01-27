import java.io.BufferedReader;
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class CF580C {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new CF580C().run();
	}
	
	ArrayList<Integer> adjList[];
	int m, n, restaurantsVisited;
	int[] cats;

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out, true);
		///
		n = f.nextInt();
		m = f.nextInt();
		adjList = new ArrayList[n];
		
		cats = new int[n];
		for(int i = 0; i < n; i++) {
			adjList[i] = new ArrayList<>();
			cats[i] = f.nextInt();
		}
		
		
		for(int i = 0; i < n-1; i++) {
			int x = f.nextInt()-1, y = f.nextInt()-1;
			//System.out.println(x + " " + y);
			adjList[x].add(y);
			adjList[y].add(x);
		}
		
		
		dfs(0,-1,cats[0]);
		
		System.out.println(restaurantsVisited);
		
		///
		f.close();
		out.flush();
	}
	
	void dfs(int currentNode, int parentNode, int numCats) {
		//System.out.println(currentNode + " " + numCats);
		if(numCats > m) return;
		int add = 1;
		for(int child : adjList[currentNode]) {
			if(child != parentNode) {
				add = 0;
				int cat = numCats * cats[child] + cats[child];
				dfs(child, currentNode, cat);
			}
		}
		//if(add == 1) System.out.println(currentNode);
		restaurantsVisited+=add;
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