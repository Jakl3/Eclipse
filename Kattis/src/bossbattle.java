import java.util.*;
import java.io.*;

public class bossbattle {
	public static void main(String[] args) throws Exception {
		new bossbattle().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = file.nextInt();
		System.out.println(n <= 2 ? 1 : n - 2);

		file.close();
	}

}