import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1379A {
	public static void main(String[] args) throws Exception {
		new CF1379A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			/*int n = f.nextInt();
			String s = f.nextLine();
			int cnt = 0;
			
			int firstOccurFull = s.indexOf("abacaba");
			int firstOccurQ = -1;
			for(int i = 0; i < n-6; i++) {
				String temp = s.substring(i,i+7);
				if(temp.equals("abacaba"))
					cnt++;
				if(firstOccurQ == -1 && equals(temp))
					firstOccurQ = i;
			}
			
			if(cnt > 1 || (firstOccurFull == -1 && firstOccurQ == -1)) {
				out.println("No");
				continue;
			}
			
			char[] c = s.toCharArray();
			if(firstOccurFull != -1) {
				for(int i = 0; i < n; i++) {
					if(c[i] == '?') c[i] = 'd';
				}
			}
			else {
				String a = "abacaba";
				for(int i = firstOccurQ; i < firstOccurQ + 7; i++) {
					if(c[i] == '?') c[i] = a.charAt(i-firstOccurQ);
				}
				for(int i = 0; i < n; i++) {
					if(c[i] == '?') c[i] = 'd';
				}
			}
			out.println("Yes");
			out.println(new String(c));*/
			
			int n = f.nextInt();
			String s = f.nextLine();
			boolean ok = false;
			String val = "abacaba";
			for(int i = 0; i < n-6; i++) {
				boolean match = true;
				StringBuilder ss = new StringBuilder(s);
				//out.println(ss);
				for(int j = 0; j < 7; j++) {
					if(s.charAt(i+j) != val.charAt(j) && s.charAt(i+j) != '?') {
						match = false;
						break;
					}
					ss.setCharAt(i+j, val.charAt(j));
				}
				if(!match) continue;
				//out.println(ss);
				
				int cnt = 0;
				for(int j = 0; j < n-6; j++) {
					if(ss.substring(j,j+7).equals(val)) cnt++;
				}
				if(cnt != 1) continue;
				ok = true;
				out.println("Yes");
				for(int j = 0; j < n; j++) {
					if(ss.charAt(j) == '?') ss.setCharAt(j, 'd');
				}
				out.println(ss);
				break;
			}
			if(!ok) out.println("No");
			
		}
		///
		out.flush();
	}
	
	/*public boolean equals(String s) {
		if(s.indexOf('?') < 0) return false;
		
		char[] c = "abacaba".toCharArray();
		char[] c1 = s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(c1[i] != '?' && c1[i] != c[i]) 
				return false;
		}
		return true;
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