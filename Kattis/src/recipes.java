import java.util.*;
import java.io.*;

public class recipes {
	public static void main(String[] args) throws Exception {
		new recipes().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int cases = Integer.parseInt(file.nextLine());
		for(int abc = 0; abc < cases; abc++) {
			int r = file.nextInt(), p = file.nextInt(), d = file.nextInt();
			file.nextLine();
			
			List<ingredient> list = new ArrayList<ingredient>();
			int index = 0;
			for(int i = 0; i < r; i++) {
				String[] in = file.nextLine().split(" ");
				ingredient ing = new ingredient(in[0], Double.parseDouble(in[1]), Double.parseDouble(in[2]));
				if(ing.percent == 100) index = i;
				list.add(ing);
			}
			
			double scaleFactor = (double) d / (double) p;
			
			double scaledWeight = list.get(index).weight * scaleFactor;
			
			System.out.println("Recipe # " + (abc+1));
			for(ingredient item : list) {
				double weight = (item.percent/100) * scaledWeight;
				System.out.println(item.name + " " + weight);
			}
			System.out.println("----------------------------------------");

		}

		file.close();
	}
	
	private class ingredient {
		String name;
		double weight;
		double percent;
		
		public ingredient(String name, double weight, double percent) {
			this.name = name;
			this.weight = weight;
			this.percent = percent;
		}
		
		public String toString() {
			return name + " " + weight + " " + percent;
		}
	}

}