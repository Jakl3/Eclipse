import java.util.*;
import java.io.*;

public class missinggnomes {
	public static void main(String[] args) throws Exception {
		new missinggnomes().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = file.nextInt(), m = file.nextInt();
		int[] test = new int[m];
		for(int i = 0; i < m; i++)
			test[i] = file.nextInt();
		
		Integer[] arr = new Integer[n];
		for(int i = 1; i <= n; i++) {
			arr[i-1] = i;
		}
		
		solve(arr, test);

		file.close();
	}
	
    public static void solve(Integer[] elements, int[] test) {

        boolean hasNext = true;

        while(hasNext) {
            
        	ArrayList<Integer> tmp = new ArrayList<Integer>(Arrays.asList(elements));
        	boolean good = true;
        	int prev = tmp.indexOf(test[0]);
			for(int j = 1; j < test.length; j++) {
				int curr = tmp.indexOf(test[j]);
				if(curr < prev) {
					good = false;
					break;
				}
				prev = curr;
			}
			if(good) {
				for(int item : tmp)
					System.out.println(item);
				return;
			}
        	
        	
            int k = 0, l = 0;
            hasNext = false;
            for (int i = elements.length - 1; i > 0; i--) {
                if (elements[i].compareTo(elements[i - 1]) > 0) {
                    k = i - 1;
                    hasNext = true;
                    break;
                }
            }
            
            if(!hasNext)
            	break;

            for (int i = elements.length - 1; i > k; i--) {
                if (elements[i].compareTo(elements[k]) > 0) {
                    l = i;
                    break;
                }
            }
            
            Integer temp = elements[k];
            elements[k] = elements[l];
            elements[l] = temp;
            
            Collections.reverse(Arrays.asList(elements).subList(k + 1, elements.length));
        }
    }
}