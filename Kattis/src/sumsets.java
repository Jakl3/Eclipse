import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class sumsets {
	public void run() throws Exception {
		
		Kattio file = new Kattio(System.in);
		int cases = file.nextInt();
		if(cases < 4) {
			System.out.println("no solution");
			return;
		}
		
		
		//solution 1 - time limit better
		ArrayList<Integer> nums = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for (int asdf = 0; asdf < cases; asdf++) {
			int input = file.nextInt();
			set.add(input);
			nums.add(input);
		}
		Collections.sort(nums);
		
		
		for(int i = nums.size()-1; i >=0; --i) {
			for(int j = 0; j < nums.size()-1; ++j) {
				if(j == i) continue;
				for(int k = j+1; k < nums.size(); ++k) {
					if(k == i || k == j) continue;
					
					int sum = nums.get(i) - nums.get(j) - nums.get(k);
					if(sum > nums.get(nums.size()-1) || sum < nums.get(0) || sum == nums.get(i) || sum == nums.get(j) || sum == nums.get(k))
						continue;
					
					if(set.contains(sum)) {
						System.out.println(nums.get(i));
						return;
					}
				}
			}
		}
		
		System.out.println("no solution");
		
		//solution 2
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < cases; ++i) {
			list.add(file.nextInt());
		}
		Collections.sort(list);
		
		HashMap<Integer, ArrayList<Index>> add;
		add = new HashMap<Integer, ArrayList<Index>>();
		TreeMap<Integer, ArrayList<Index>> sub;
		sub = new TreeMap<Integer, ArrayList<Index>>(Collections.reverseOrder());
		
		for(int i = 0; i < list.size()-1; ++i) {
			for(int j = i+1; j < list.size(); ++j) {
				int addition = list.get(i) + list.get(j);
				int subtraction = list.get(j) - list.get(i);
				
				if(add.containsKey(addition))
					add.get(addition).add(new Index(i, j));
				else
					add.put(addition, new ArrayList<Index>(Arrays.asList(new Index(i,j))));
				
				
				if(sub.containsKey(subtraction))
					sub.get(subtraction).add(new Index(i, j));
				else
					sub.put(subtraction, new ArrayList<Index>(Arrays.asList(new Index(i,j))));
			}
		}
		
		for(int key : sub.keySet()) {
			if(add.containsKey(key) == false) continue;
			
			ArrayList<Index> addTemp = new ArrayList<Index>();
			addTemp.addAll(add.get(key));
			ArrayList<Index> subTemp = new ArrayList<Index>();
			subTemp.addAll(sub.get(key));
			 
			
		}*/
	}

	public static void main(String[] args) throws Exception {
		new sumsets().run();
	}
	
	/*private class Index {
		int first;
		int second;
		public Index(int first, int second) {
			this.first = first;
			this.second = second;
		}
		public String toString() {
			return first + " " + second;
		}
		public boolean good(Index i) {
			return i.first != first && i.first != second && i.second != first && i.second != second;
		}
	}*/
	
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