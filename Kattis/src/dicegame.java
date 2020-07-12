import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class dicegame {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int gunnar = file.nextInt() + file.nextInt() + file.nextInt() + file.nextInt();
		int emma = file.nextInt() + file.nextInt() + file.nextInt() + file.nextInt();
		
		System.out.println(gunnar > emma ? "Gunnar" : gunnar == emma ? "Tie" : "Emma");
	}

	public static void main(String[] args) throws Exception {
		new dicegame().run();
	}

}