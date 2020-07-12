import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class a_different_problem
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);

		while(file.hasNext()) {
			long one = file.nextLong();
			long two = file.nextLong();

			System.out.println(Math.abs(one-two));
		}
	}

	public static void main(String[] args) throws Exception
	{
		new a_different_problem().run();
	}

}
