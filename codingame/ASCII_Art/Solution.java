import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int H = in.nextInt();
		in.nextLine();
		String T = in.nextLine();
		for (int i = 0; i < H; i++) {
			list.add(in.nextLine());
		}


		for(int j = 0; j < H; j++) {
			for(int k = 0; k < T.length(); k++) {

				char t = transform(T.toCharArray()[k]);

				int indexOfLetter = 0;
				if( t != '?') {
					indexOfLetter += t - 'A';
				} else {
					indexOfLetter = 26;
				}

				for(int i = 0; i < L; i++) {

					System.out.print(list.get(j).charAt(i + indexOfLetter * L));
				}

			}
			System.out.println();
		}

	}

	private static char transform(char c) {
		if(c >= 'a' && c <= 'z') {
			return (char)('A' + c - 'a');
		} else if (c >= 'A' && c <= 'Z') {
			return c;
		} else {
			return '?';
		}

	}
}

