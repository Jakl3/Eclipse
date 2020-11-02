import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1393B {
	public static void main(String[] args) throws Exception {
		new CF1393B().run();
	}

	int[] nums = new int[200100];
	int[] cnt = new int[200100];
	
	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		for(int i = 0; i < n; i++) {
			int t = f.nextInt();
			nums[t]++;
			cnt[nums[t]]++;
		}
		n = f.nextInt();
		for(int i = 0; i < n; i++) {
			String[] s = f.nextLine().split(" ");
			char c = s[0].charAt(0);
			int num = Integer.parseInt(s[1]);
			if(c == '+') {
				nums[num]++;
				cnt[nums[num]]++;
			}
			else {
				cnt[nums[num]]--;
				nums[num]--;
			}
			out.println(check() ? "YES" : "NO");
		}
		
		///
		out.flush();
	}
	
	public boolean check() {
		if(cnt[8] > 0) return true;
		if(cnt[4] >= 2) return true;
		if(cnt[6] > 0 && cnt[2] >= 2) return true;
		if(cnt[4] > 0 && cnt[2] >= 3) return true;
		return false;
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

		public int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
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