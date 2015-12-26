
public class P136 {

	public static void main(String[] args) {
		int count = 0;
		for(long i = 1; ; i++) {
			if(checkIfUgly(i)) {
				count ++;
			}
			if(count == 1500) {
				System.out.println("The 1500'th ugly number is "+i+".");
				return;
			}
		}

	}

	private static boolean checkIfUgly(long i) {
		while(true) {
			boolean b = false;
			if(i % 2 == 0) {
				i = i / 2;
				b = true;
			}
			if(i % 3 == 0) {
				i = i / 3;
				b = true;
			}
			if(i % 5 == 0) {
				i = i / 5;
				b = true;
			}
			if(i == 1)  {
				return true;
			}
			if(b == false && i > 1) {
				return false;
			}
		}
	}

}
