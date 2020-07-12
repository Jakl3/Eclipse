import java.util.*;
import java.io.*;

public class timebomb {
	public static void main(String[] args) throws Exception {
		new timebomb().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		for(int i = 0; i < 5; i++) {
			list.add(new ArrayList<String>(Arrays.asList(file.nextLine().split(""))));
			//System.out.println(list.get(i));
		}
		
		List<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < list.get(0).size(); i += 4 ) {
			String s = "";
			for(int j = 0; j < 5; j++) {
				for(int k = 0; k < 3; k++) {
					s += list.get(j).get(i+k);
				}
			}
			nums.add(new Digits(s).num);
		}
		
		//System.out.println(nums);
		
		if(nums.contains(-1))
			System.out.println("BOOM!!");
		else {
			int n = Integer.parseInt(nums.toString().replaceAll("[\\[\\], ]",""));
			System.out.println(n % 6 == 0 ? "BEER!!" : "BOOM!!");
		}
		

		file.close();
	}
	
	private class Digits {
		int num;
		
		public Digits(String s) {
			num = -1;
			switch(s) {
				case "**** ** ** ****": num = 0; break;
				case "  *  *  *  *  *": num = 1; break;
				case "***  *****  ***": num = 2; break;
				case "***  ****  ****": num = 3; break;
				case "* ** ****  *  *": num = 4; break;
				case "****  ***  ****": num = 5; break;
				case "****  **** ****": num = 6; break;
				case "***  *  *  *  *": num = 7; break;
				case "**** ***** ****": num = 8; break;
				case "**** ****  ****": num = 9; break;
			}
		}

		public String toString() {
			return "" + num;
		}
		
	}

}