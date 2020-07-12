import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class erase {
	public void run() throws Exception {
		Kattio file = new Kattio(System.in);
		int n = file.nextInt();
		String before = file.nextLine();
		String after = file.nextLine();
		
		if(n % 2 == 0 && before.equals(after)) {
			System.out.println("Deletion succeeded");
			return;
		}
		if(n % 2 == 1 && after.equals(flip(before))) {
			System.out.println("Deletion succeeded");
			return;
		}
		System.out.println("Deletion failed");

		file.close();
	}
	
	public String flip(String original) {
		String[] dab = original.split("");
		for(int i = 0; i < dab.length; i++) {
			if(dab[i].equals("1")) dab[i] = "0";
			else dab[i] = "1";
		}
		return String.join("", dab);
	}

	public static void main(String[] args) throws Exception {
		new erase().run();
	}

	private class Kattio extends PrintWriter {

		private BufferedReader r;
		private String line;
		private StringTokenizer st;
		private String token;

		public Kattio(InputStream i) {
			super(new BufferedOutputStream(System.out));
			r = new BufferedReader(new InputStreamReader(i));
		}

		public Kattio(InputStream i, OutputStream o) {
			super(new BufferedOutputStream(o));
			r = new BufferedReader(new InputStreamReader(i));
		}

		public boolean hasNext() {
			return peekToken() != null;
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public String next() {
			return nextToken();
		}

		public String nextLine() {
			token = null;
			st = null;
			try {
				return r.readLine();
			} catch (IOException e) {
				return null;
			}
		}

		private String peekToken() {
			if (token == null)
				try {
					while (st == null || !st.hasMoreTokens()) {
						line = r.readLine();
						if (line == null)
							return null;
						st = new StringTokenizer(line);
					}
					token = st.nextToken();
				} catch (IOException e) {
				}
			return token;
		}

		private String nextToken() {
			String ans = peekToken();
			token = null;
			return ans;
		}
	}

}