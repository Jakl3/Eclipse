import java.util.*;
import java.io.*;

public class compoundwords {

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		List<String> out = new ArrayList<String>();
		
		while(file.hasNext()) {
			list.add(file.next());
		}
		
		//System.out.println(list);
			
		for(int i = 0; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++) {
				String one = list.get(i) + list.get(j);
				String two = list.get(j) + list.get(i);
				
				if(!out.contains(one)) out.add(one);
				if(!out.contains(two)) out.add(two);
			}
		}
		
		Collections.sort(out);
		
		for(int i = 0; i < out.size(); i++) {
			System.out.println(out.get(i));
		}

		file.close();
	}
	
	public static void main(String[] args) throws Exception {
		new compoundwords().run();
	}

}