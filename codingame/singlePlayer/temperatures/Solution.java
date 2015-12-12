import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // the number of temperatures to analyse

		if(n == 0) {
			System.out.println(0);
			System.exit(0);
		}

		Integer tab []= new Integer[n];
		for(int i = 0; i < n; i++) {
			tab[i] = in.nextInt();
		}

		Integer procheDeZero = tab[0];

		for(int i = 1; i < tab.length; i++) {
			if((Math.abs(procheDeZero) > Math.abs(tab[i]))
					||
				((Math.abs(procheDeZero) == Math.abs(tab[i]))
					&&
				procheDeZero < Math.abs(tab[i]))
				)
				procheDeZero = tab[i] ;
		}
		
		System.out.println(procheDeZero);
	}
}
