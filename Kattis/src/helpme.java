import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class helpme {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		char[][] mat = new char[8][8];
		List<Piece> white = new ArrayList<Piece>();
		List<Piece> black = new ArrayList<Piece>();
		
		file.nextLine();
		for(int i = 0; i < 8; i++) {
			char[] in = file.nextLine().toCharArray();
			file.nextLine();
			int n = 0;
			for(int j = 2; j < in.length; j += 4) {
				mat[i][n++] = in[j];
			}
			
			for(int j = 0; j < 8; j++) {
				if(isUpper(mat[i][j])) white.add(new Piece(true, mat[i][j], 8-i, j));
				else if(isLower(mat[i][j])) black.add(new Piece(false, mat[i][j], 8-i, j));
			}
		}
		
		Collections.sort(white);
		Collections.sort(black);
		
		System.out.printf("White: %s\n", white.toString().replaceAll("[\\[\\] ]", ""));
		System.out.printf("Black: %s\n", black.toString().replaceAll("[\\[\\] ]", ""));

		file.close();
	}
	
	public boolean isUpper(char c) {
		return (c >= 'A' && c <= 'Z');
	}
	
	public boolean isLower(char c) {
		return (c >= 'a' && c <= 'z');
	}
	
	private class Piece implements Comparable<Piece> {
		char piece;
		int letter;
		int num;
		
		int first;
		
		boolean white;
		
		public Piece(boolean w, char p, int n, int l) {
			white = w;
			piece = Character.toUpperCase(p);
			letter = l;
			num = n;
			
			switch(this.piece) {
				case 'K': first = 1; break;
				case 'Q': first = 2; break;
				case 'R': first = 3; break;
				case 'B': first = 4; break;
				case 'N': first = 5; break;
				case 'P': first = 6; break;
			}
		}
		
		public String toString() {
			if(piece == 'P')
				return "" + (char)(letter + 'a') + num;
			else
				return "" + piece + (char)(letter + 'a') + num;
		}
		
		public int compareTo(Piece p) {
			int f = 0;
			switch(p.piece) {
				case 'K': f = 1; break;
				case 'Q': f = 2; break;
				case 'R': f = 3; break;
				case 'B': f = 4; break;
				case 'N': f = 5; break;
				case 'P': f = 6; break;
			}
			
			int fTest = ((Integer)this.first).compareTo(f);
			if(fTest != 0) return fTest;
			
			int sTest = 0;
			if(white) {
				if(this.num > p.num)
					sTest = 1;
				else if(this.num < p.num)
					sTest = -1;
				else
					sTest = 0;
			}
			else {
				if(this.num < p.num)
					sTest = 1;
				else if(this.num > p.num)
					sTest = -1;
				else
					sTest = 0;
			}
			if(sTest != 0) return sTest;
			
			return ((Integer)this.letter).compareTo(p.letter);
		}
	}

	public static void main(String[] args) throws Exception {
		new helpme().run();
	}

}