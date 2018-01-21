import java.util.Scanner;

public class P299 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer casesNb = sc.nextInt();
		for(int i = 0; i < casesNb; i++) {
			int swapCount = 0;
			Integer carriagesNb = sc.nextInt();
			Integer[] list = new Integer[carriagesNb];
			for(int j = 0; j < carriagesNb; j++) {
				list[j] = sc.nextInt();
			}
			while(true) {
				Boolean hasChanged = false;
				for(int j = 0; j < list.length -1; j++) {
					if(list[j] > list[j+1]) {
						int swap = list[j];
						list[j] = list[j + 1];
						list[j + 1] = swap;
						swapCount++;
						hasChanged = true;
					}
				}
				if(!hasChanged) {
					break;
				}
			}
			System.out.println("Optimal train swapping takes " + swapCount + " swaps.");
			
		}
		sc.close();
	}

}

