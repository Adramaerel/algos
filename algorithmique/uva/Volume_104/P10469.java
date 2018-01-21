import java.util.Scanner;

public class P10469 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			Integer nb1 = sc.nextInt();
			Integer nb2 = sc.nextInt();
			sc.nextLine();
			String nombre1 = Integer.toBinaryString(nb1);
			String nombre2 = Integer.toBinaryString(nb2);
			int maxLength = Math.max(nombre1.length(), nombre2.length());
			nombre1 = completeWithZeros(nombre1, maxLength);
			nombre2 = completeWithZeros(nombre2, maxLength);
			
			String result = "";
			for(int i = maxLength - 1; i >= 0; i--) {
				char c1 = nombre1.charAt(i);
				char c2 = nombre2.charAt(i);
				
				if (c1 == c2) {
					result = '0' + result;
				}
				
				if (c1 != c2) {
					result = '1' + result;
				}
				
			}
			
			Integer res = Integer.parseInt(result, 2);
			System.out.println(res);
			
		}
		sc.close();
	}

	private static String completeWithZeros(String nombre1, int maxLength) {
		for(int i = nombre1.length(); i < maxLength; i++) {
			nombre1 = "0" + nombre1;
		}
		return nombre1;
	}

}

