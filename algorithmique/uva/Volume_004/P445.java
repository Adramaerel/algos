import java.util.Scanner;

public class P445 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()) {
			String ligne = sc.nextLine();
			if(ligne.isEmpty()) {
				sb.append("\n");
				continue;
			}
			int sum = 0;
			for(int i = 0; i < ligne.length(); i++) {
				char c = ligne.charAt(i);
				if(c >= '1' && c <= '9') {
					sum += Integer.parseInt("" + c);
				} 
				if (c == 'b' || (c >= 'A' && c <= 'Z') || c == '*') {
					for(int j = 0; j < sum; j++) {
						sb.append(c == 'b' ? ' ' : c);
					}
					sum = 0;
				}
				if(c == '!')
					sb.append("\n");
			}
			sb.append('\n');
			
		}
		System.out.print(sb);
		sc.close();

	}

}
