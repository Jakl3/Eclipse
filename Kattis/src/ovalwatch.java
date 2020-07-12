import java.util.*;
import java.io.*;

public class ovalwatch {
	public void run() throws Exception {
		Kattio file = new Kattio(System.in);
		
		int players = file.nextInt();
		int legs = file.nextInt();
		
		int maxHeight = -1;
		
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		for(int i = 0; i < legs; ++i) {
			int left = file.nextInt();
			int height = file.nextInt();
			
			if(maxHeight < height)
				maxHeight = height;

			if(map.containsKey(left)) {
				map.get(left).add(height);
			}
			else {
				map.put(left, new ArrayList<Integer>(Arrays.asList(height)));	
			}
		}
		
		for(int item : map.keySet()) {
			Collections.sort(map.get(item));
		}

		String out = "";
		for(int i = 0; i < players; ++i) {
			int player = i;
			int height = 0;
			while(height < maxHeight) {
				ArrayList<Integer> left = map.get(player);
				ArrayList<Integer> right = map.get(player - 1);
				int leftHold = Integer.MAX_VALUE, rightHold = Integer.MAX_VALUE;				
				if(left != null)
					leftHold = binSearch(left, height);
				if(right != null)
					rightHold = binSearch(right, height);
				if(leftHold == rightHold) break;
				if(leftHold < rightHold) player++;
				else player--;
				
				height = Math.min(leftHold, rightHold);		
			}
			out += player + " ";
		}
		System.out.println(out.trim());
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new ovalwatch().run();
	}
	
	private static int binSearch(ArrayList<Integer> list, int height) {
		
		int l = 0, r = list.size()-1;
		int ans = -1;
		
		while(l <= r) {
			int mid = l + (r - l) / 2;
			if(list.get(mid) > height) {
				ans = mid;
				r = mid-1;
			}
			else
				l = mid+1;
		}
		
		return ans == -1 ? Integer.MAX_VALUE : list.get(ans);
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
