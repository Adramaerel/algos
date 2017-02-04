import java.util.Scanner;

public class P102 {
	static class Solution {
		long nbMouvements;
		String solution;
	}
	
	private static Solution calculateSolution(long[] a, long[] b, long[] c) {
		Solution solution[] = new Solution[6];
		for(int i = 0; i < solution.length; i++) {
			solution[i] = new Solution(); 
		}
		
		
		solution[0].solution = "BCG";
		solution[0].nbMouvements = b[0] + c[0] + a[2] + c[2] + a[1] + b[1];
		
		solution[1].solution = "BGC";
		solution[1].nbMouvements = b[0] + c[0] + a[1] + c[1] + a[2] + b[2];
		
		solution[2].solution = "CBG";
		solution[2].nbMouvements = b[2] + c[2] + a[0] + c[0] + a[1] + b[1];
		
		solution[3].solution = "CGB";
		solution[3].nbMouvements = b[2] + c[2] + a[1] + c[1] + a[0] + b[0];
		
		solution[4].solution = "GBC";
		solution[4].nbMouvements = b[1] + c[1] + a[0] + c[0] + a[2] + b[2];
		
		solution[5].solution = "GCB";
		solution[5].nbMouvements = b[1] + c[1] + a[2] + c[2] + a[0] + b[0];
		
		Solution bestSolution = solution[0];
		for(int i = 0; i < solution.length; i++) {
			if(solution[i].nbMouvements < bestSolution.nbMouvements) {
				bestSolution = solution[i];
			}
		}
		return bestSolution;
	}

	public static void main(String... args) throws Exception {
		
		long a[] = new long [3];
		long b[] = new long [3];
		long c[] = new long [3];

		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			for(int i = 0; i < 3; i++) {
				a[i] = input.nextLong();
			}
			for(int i = 0; i < 3; i++) {
				b[i] = input.nextLong();
			}
			for(int i = 0; i < 3; i++) {
				c[i] = input.nextLong();
			}
			Solution solution = calculateSolution(a, b, c);
			System.out.println(solution.solution + " " + solution.nbMouvements);
		}
		input.close();
		
		
	}

}

