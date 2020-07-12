import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class piglatin {
	public static void main(String[] args) throws Exception {
		new piglatin().run();
	}

	String vowels = "aeiouy";
	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		String s;
		while((s = f.nextLine()) != null) {
			String[] sent = s.split(" ");
			for(int i=0; i<sent.length; i++) {
				String se = sent[i];
				if(vowels.indexOf(se.substring(0,1)) != -1) se += "yay";
				else {
					int t = findVowel(se);
					se = se.substring(t) + se.substring(0,t) + "ay";
				}
				sent[i] = se;
			}
			System.out.println(Arrays.toString(sent).replaceAll("[\\[\\],]", ""));
		}
		///
		out.flush();
	}
	
	public int findVowel(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(vowels.indexOf(String.valueOf(s.charAt(i))) != -1)
				return i;
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