import java.util.*;

public class sumkindofproblem {
	
	public static void main(String[] args) {
		Scanner file = new Scanner(System.in);
		file.nextLine();
		
		while(file.hasNext()) {
			int current = file.nextInt();
			int n = file.nextInt();
			int s1 = (n * (1 + n)) / 2;
			int s2 = n * n;
			int s3 = n * (n+1);
			
			System.out.printf("%d %d %d %d\n", current, s1, s2, s3);
		}
		
		file.close();
	}
	
	
}