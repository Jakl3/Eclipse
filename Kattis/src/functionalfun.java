// https://open.kattis.com/problems/functionalfun

import java.util.*;
import java.io.*;

public class functionalfun {
	public static void main(String[] args) throws Exception {
		new functionalfun().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(file.hasNext()) {
			List<String> domain = new ArrayList<String>(Arrays.asList(file.nextLine().split(" ")));
			List<String> codomain = new ArrayList<String>(Arrays.asList(file.nextLine().split(" ")));
			int n = Integer.parseInt(file.nextLine());
			
			domain.remove(0);
			codomain.remove(0);
			
			Map<String, ArrayList<String>> cd = new HashMap<String, ArrayList<String>>();
			Map<String, ArrayList<String>> d = new HashMap<String, ArrayList<String>>();
			
			boolean function = true;
			boolean injective = true;
			for(int i = 0; i < n; i++) {
				String[] in = file.nextLine().split(" ");
				
				int temp = codomain.indexOf(in[2]);
				if(temp != -1)
					codomain.remove(temp);
				
				if(cd.containsKey(in[2])) injective = false;
				else cd.put(in[2], new ArrayList<String>(Arrays.asList(in[0])));
				
				if(d.containsKey(in[0])) function = false;
				else d.put(in[0], new ArrayList<String>(Arrays.asList(in[2])));
			}
			
			//System.out.println(cd);
			//System.out.println(d);
			
			boolean surjective = codomain.size() == 0;
			
			System.out.println(!function ? "not a function" :
				surjective && injective ? "bijective" : 
					surjective && !injective ? "surjective" :
						!surjective && injective ? "injective" : 
							"neither injective nor surjective");
			
		}

		file.close();
	}

}