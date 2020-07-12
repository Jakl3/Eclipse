import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class mancala {
	public static void main(String[] args) throws Exception {
		new mancala().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int cases = f.nextInt(), n = f.nextInt();
			int[] nums = new int[2000];
			int index = 0;
			
			for(int i = 0; i < n; i++) {
				index = 0;
				while(nums[index] != 0) 
					index++;
				
				nums[index] = index+1;
				for(int j = 0; j < index; j++)
					nums[j]--;
			}
			
			index = 1999;
			while(nums[index] == 0) index--;
			
			out.println(cases + " " + (index+1));
			
			for(int i = 0; i <= index; i++) {
				out.print(nums[i] + " ");
				if(i % 10 == 9) out.println();
			}
			if(index % 10 != 9) out.println();
		}
		///
		out.flush();
	}

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