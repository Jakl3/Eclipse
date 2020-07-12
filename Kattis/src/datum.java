import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class datum {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int day = file.nextInt(), month = file.nextInt();
		GregorianCalendar cal = new GregorianCalendar(2009, month-1, day);
		
		
		String out = "";
		
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: out = "Sunday"; break;
		case 2: out = "Monday"; break;
		case 3: out = "Tuesday"; break;
		case 4: out = "Wednesday"; break;
		case 5: out = "Thursday"; break;
		case 6: out = "Friday"; break;
		case 7: out = "Saturday"; break;
		}
		
		System.out.println(out);
	}

	public static void main(String[] args) throws Exception {
		new datum().run();
	}

}