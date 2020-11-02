import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class chartingprogress {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new chartingprogress().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		String s;
		while((s=f.nextLine())!=null) {
			List<char[]> mat = new ArrayList<>();

			
			String in = s;
			
			int cnt = 0;
			while(in!=null) {
				if(in.equals("")) break;
				char[] c = in.toCharArray();
				Arrays.sort(c);
				mat.add(c);
				for(char item : c) {
					if(item == '*') cnt++;
					else break;
				}
				
				in = f.nextLine();
			}
			
			
			
			
			int n = mat.size();

			int min = 0;
			for(int i = n-1; i >= 0; i--) {
				sort(mat.get(i));
				shift(mat.get(i),min);
				int t = indexOf(mat.get(i));
				min = t == -1 ? min : t+1;
			}
			
			for(int i = 0; i < mat.size(); i++) {
				System.out.println(new String(mat.get(i)));
			}
		}
		///
		f.close();
		out.flush();
	}
	
	int indexOf(char[] arr) {
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] == '*') return i;
		}
		return -1;
	}
	
	void shift(char[] arr, int shift) {
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] == '*') {
				arr[i] = '.';
				arr[i+shift] = '*';
			}
		}
	}
	
	void sort(char[] arr) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            char key = arr[i]; 
            int j = i - 1; 

            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
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

		public void close() throws IOException {
			reader.close();
		}
	}
}