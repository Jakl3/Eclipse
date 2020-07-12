/*import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class musicalscales {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int num = file.nextInt();
		ArrayList<String> notes = new ArrayList<String>(Arrays.asList(file.nextLine().split(" ")));
		HashSet<String> set = new HashSet<String>();
		set.addAll(notes);
		
		String[] a1 = "A, B, C#, D, E, F#, G#, A".split(", ");
		ArrayList<String> a = new ArrayList<String>(Arrays.asList(a1));
		
		String[] aSharp1 = "A#, C, D, D#, F, G, A, A#".split(", ");
		ArrayList<String> aSharp = new ArrayList<String>(Arrays.asList(aSharp1));
		
		String[] b1 = "B, C#, D#, E, F#, G#, A#, B".split(", ");
		ArrayList<String> b = new ArrayList<String>(Arrays.asList(b1));
		
		String[] c1 = "C, D, E, F, G, A, B, C".split(", ");
		ArrayList<String> c = new ArrayList<String>(Arrays.asList(c1));
		
		String[] cSharp1 = "C#, D#, F, F#, G#, A#, C, C#".split(", ");
		ArrayList<String> cSharp = new ArrayList<String>(Arrays.asList(cSharp1));
		
		String[] d1 = "D, E, F#, G, A, B, C#, D".split(", ");
		ArrayList<String> d = new ArrayList<String>(Arrays.asList(d1));
		
		String[] dSharp1 = "D#, F, G, G#, A#, C, D, D#".split(", ");
		ArrayList<String> dSharp = new ArrayList<String>(Arrays.asList(dSharp1));
		
		String[] e1 = "E, F#, G#, A, B, C#, D#, E".split(", ");
		ArrayList<String> e = new ArrayList<String>(Arrays.asList(e1));
		
		String[] f1 = "F, G, A, A#, C, D, E, F".split(", ");
		ArrayList<String> f = new ArrayList<String>(Arrays.asList(f1));
		
		String[] fSharp1 = "F#, G#, A#, B, C#, D#, F, F#".split(", ");
		ArrayList<String> fSharp = new ArrayList<String>(Arrays.asList(fSharp1));
		
		String[] g1 = "G, A, B, C, D, E, F#, G".split(", ");
		ArrayList<String> g = new ArrayList<String>(Arrays.asList(g1));
		
		String[] gSharp1 = "G#, A#, C, C#, D#, F, G, G#".split(", ");
		ArrayList<String> gSharp = new ArrayList<String>(Arrays.asList(gSharp1));
				
		ArrayList<String> out = new ArrayList<String>();
		HashSet<String> temp = new HashSet<String>();
		temp.addAll(set);
		temp.retainAll(a);
		if(temp.size() == set.size()) out.add(a.get(0));
		
		temp = new HashSet<String>();
		temp.addAll(set);
		temp.retainAll(aSharp);
		if(temp.size() == set.size()) out.add(aSharp.get(0));
		
		temp = new HashSet<String>();
		temp.addAll(set);
		temp.retainAll(b);
		if(temp.size() == set.size()) out.add(b.get(0));
		
		temp = new HashSet<String>();
		temp.addAll(set);
		temp.retainAll(c);
		if(temp.size() == set.size()) out.add(c.get(0));
		
		temp = new HashSet<String>();
		temp.addAll(set);
		temp.retainAll(cSharp);
		if(temp.size() == set.size()) out.add(cSharp.get(0));
		
		temp = new HashSet<String>();
		temp.addAll(set);
		temp.retainAll(d);
		if(temp.size() == set.size()) out.add(d.get(0));
		
		temp = new HashSet<String>();
		temp.addAll(set);
		temp.retainAll(dSharp);
		if(temp.size() == set.size()) out.add(dSharp.get(0));
		
		temp = new HashSet<String>();
		temp.addAll(set);
		temp.retainAll(f);
		if(temp.size() == set.size()) out.add(f.get(0));
		
		temp = new HashSet<String>();
		temp.addAll(set);
		temp.retainAll(fSharp);
		if(temp.size() == set.size()) out.add(fSharp.get(0));
		
		temp = new HashSet<String>();
		temp.addAll(set);
		temp.retainAll(e);
		if(temp.size() == set.size()) out.add(e.get(0));
		
		temp = new HashSet<String>();
		temp.addAll(set);
		temp.retainAll(g);
		if(temp.size() == set.size()) out.add(g.get(0));
		
		temp = new HashSet<String>();
		temp.addAll(set);
		temp.retainAll(gSharp);
		if(temp.size() == set.size()) out.add(gSharp.get(0));
		
		Collections.sort(out);
		System.out.println(out);
			
	}

	public static void main(String[] args) throws Exception {
		new musicalscales().run();
	}

}*/

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class musicalscales {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int num = file.nextInt(); file.nextLine();
		String[] music = "A, A#, B, C, C#, D, D#, E, F, F#, G, G#, A, A#, B, C, C#, D, D#, E, F, F#, G, G#, A, A#, B, C, C#, D, D#, E, F, F#, G, G#".split(", ");
		
		ArrayList<String> notes = new ArrayList<String>(Arrays.asList(file.nextLine().split(" ")));
		
		ArrayList<String> scales = new ArrayList<String>();
		for(int i = 0; i < 12; i++) {
			ArrayList<String> curr = new ArrayList<String>();
			int k = i;
			curr.add(music[k]);
			k+=2;
			curr.add(music[k]);
			k+=2;
			curr.add(music[k]);
			k++;
			curr.add(music[k]);
			k+=2;
			curr.add(music[k]);
			k+=2;
			curr.add(music[k]);
			k+=2;
			curr.add(music[k]);
			k++;
			curr.add(music[k]);
			boolean good = true;
			for(String item : notes) {
				if(curr.contains(item) == false) {
					good = false;
					break;
				}
			}
			if(good) scales.add(music[i]);
		}
		
		System.out.println(scales.size() == 0 ? "none" : scales.toString().replaceAll("[\\[\\],]", ""));
	}

	public static void main(String[] args) throws Exception {
		new musicalscales().run();
	}

}