import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class astrologicalsign {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new astrologicalsign().run();
	}
	
	class Day implements Comparable<Day> {
		int month;
		int day;
		
		public Day(String s) {
			String[] s1 = s.split(" ");
			switch(s1[1]) {
			case "Jan" : month = 1; break;
			case "Feb" : month = 2; break;
			case "Mar" : month = 3; break;
			case "Apr" : month = 4; break;
			case "May" : month = 5; break;
			case "Jun" : month = 6; break;
			case "Jul" : month = 7; break;
			case "Aug" : month = 8; break;
			case "Sep" : month = 9; break;
			case "Oct" : month = 10; break;
			case "Nov" : month = 11; break;
			case "Dec" : month = 12; break;
			}
			day = Integer.parseInt(s1[0]);
		}
		
		public int compareTo(Day d) {
			int temp = Integer.compare(month,d.month);
			if(temp == 0) {
				return Integer.compare(day, d.day);
			}
			return temp;
		}
		
		public String toString() {
			return month + " " + day;
		}
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out, true);
		///
		
		Map<String,Day[]> map = new HashMap<>();
		map.put("Aries", new Day[] {new Day("21 Mar"), new Day("20 Apr")});
		map.put("Taurus", new Day[] {new Day("21 Apr"), new Day("20 May")});
		map.put("Gemini", new Day[] {new Day("21 May"), new Day("21 Jun")});
		map.put("Cancer", new Day[] {new Day("22 Jun"), new Day("22 Jul")});
		map.put("Leo", new Day[] {new Day("23 Jul"), new Day("22 Aug")});
		map.put("Virgo", new Day[] {new Day("23 Aug"), new Day("21 Sep")});
		map.put("Libra", new Day[] {new Day("22 Sep"), new Day("22 Oct")});
		map.put("Scorpio", new Day[] {new Day("23 Oct"), new Day("22 Nov")});
		map.put("Sagittarius", new Day[] {new Day("23 Nov"), new Day("21 Dec")});
		
		//map.put("Capricorn", new Day[] {new Day("22 Dec"), new Day("20 Jan")});
		
		map.put("Aquarius", new Day[] {new Day("21 Jan"), new Day("19 Feb")});
		map.put("Pisces", new Day[] {new Day("20 Feb"), new Day("20 Mar")});
		
		
		// if after is 1, before is -1
		int N = f.nextInt();
		while(N-->0) {
			Day d = new Day(f.nextLine());
			//System.out.println(d.compareTo(new Day("6 May")));
			String res = "";
			for(String item : map.keySet()) {
				//System.out.println(item);
				//System.out.println(d.compareTo(map.get(item)[0]));
				//System.out.println(d.compareTo(map.get(item)[1]));
				if(d.compareTo(map.get(item)[0]) > -1 && d.compareTo(map.get(item)[1]) < 1) {
					res = item;
				}
			}
			if(res.equals("")) res = "Capricorn";
			System.out.println(res);
		}

		///
		f.close();
		out.flush();
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