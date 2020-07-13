import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class blackfriday {
	public static void main(String[] args) throws Exception {
		new blackfriday().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			list.add(f.nextInt());
		}
		int[] occur = new int[6];
		for(int item : list) occur[item-1]++;
		//out.println(Arrays.toString(occur));
        
		int num = -1, min = 7;
		for(int i = 0; i < 6; i++) {
			if(occur[i] != 0 && occur[i] <= min) {
				min = occur[i];
				num = i+1;
			}
		}
		int fi = list.indexOf(num), se = list.lastIndexOf(num);
		out.println(fi != se ? "none" : fi+1);
		
		///
		out.flush();
	}
	
	public int indexOf(int[] arr, int n) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == n) return i;
		}
		return -1;
	}
	public int lastIndexOf(int[] arr, int n) {
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] == n) return i;
		}
		return -1;
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