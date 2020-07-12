import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class guessthedatastructure {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
/*		while(file.hasNext()) {
			
			Queue<Integer> q = new LinkedList<Integer>();
			Stack<Integer> s = new Stack<Integer>();
			TreeSet<Integer> pq = new TreeSet<Integer>();
			
			int times = Integer.parseInt(file.nextLine());
			ArrayList<Integer> poll = new ArrayList<Integer>();
			
			for(int i = 0; i < times; i++) {
				String[] in = file.nextLine().split(" ");
				if(in[0].equals("1")) {
					q.add(Integer.parseInt(in[1]));
					s.add(Integer.parseInt(in[1]));
					pq.add(Integer.parseInt(in[1]));
				}
				else {
					poll.add(Integer.parseInt(in[1]));
				}
			}
			
			if(q.isEmpty()) {
				System.out.println("impossible");
				continue;
			}
			
			boolean qy = true, sy = true, pqy = true;
			for(int item : poll) {
				int qt = q.poll(), st = s.pop(), pqt = pq.pollLast();
				if(item != qt) {
					qy = false;
				}
				if(item != st) {
					sy = false;
				}
				if(item != pqt) {
					pqy = false;
				}
			}
			
			if(qy && !sy && !pqy) {
				System.out.println("queue");
				continue;
			}
			if(!qy && sy && !pqy) {
				System.out.println("stack");
				continue;
			}
			if(!qy && !sy && pqy) {
				System.out.println("priority queue");
				continue;
			}
			if(!qy && !sy && !pqy) {
				System.out.println("impossible");
				continue;
			}
			System.out.println("not sure");
		}*/
		while(file.hasNext()) {
			int times = file.nextInt();
			int[] cmd = new int[times];
			int[] vals = new int[times];
			for(int i = 0; i < times; i++) {
				cmd[i] = file.nextInt();
				vals[i] = file.nextInt();
			}
			
			int count = 0;
			String dataStructure = "impossible";
			if(queue(cmd,vals)) {
				count++;
				dataStructure = "queue";
			}
			if(stack(cmd,vals)) {
				count++;
				dataStructure = "stack";
			}
			if(pqueue(cmd,vals)) {
				count++;
				dataStructure = "priority queue";
			}
			
			System.out.println(count > 1 ? "not sure" : dataStructure);
		}
		
		
		file.close();
	}
	
	public boolean queue (int[] cmd, int[] vals) {
		ArrayList<Integer> queue = new ArrayList<Integer>();
		for(int i = 0; i < cmd.length; i++) {
			if(cmd[i] == 1) {
				queue.add(vals[i]);
			}
			else if (queue.isEmpty() || vals[i] != queue.remove(0)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean stack (int[] cmd, int[] vals) {
		ArrayList<Integer> stack = new ArrayList<Integer>();
		for(int i = 0; i < cmd.length; i++) {
			if(cmd[i] == 1) {
				stack.add(vals[i]);
			}
			else if (stack.isEmpty() || vals[i] != stack.remove(stack.size()-1)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean pqueue (int[] cmd, int[] vals) {
		ArrayList<Integer> pqueue = new ArrayList<Integer>();
		for(int i = 0; i < cmd.length; i++) {
			if(cmd[i] == 1) {
				pqueue.add(vals[i]);
			}
			else {
				Collections.sort(pqueue);
				if (pqueue.isEmpty() || vals[i] != pqueue.remove(pqueue.size()-1))
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		new guessthedatastructure().run();
	}

}