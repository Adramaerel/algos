import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P10921 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 2);
		map.put("B", 2);
		map.put("C", 2);
		
		map.put("D", 3);
		map.put("E", 3);
		map.put("F", 3);
		
		map.put("G", 4);
		map.put("H", 4);
		map.put("I", 4);
		
		map.put("J", 5);
		map.put("K", 5);
		map.put("L", 5);
		
		map.put("M", 6);
		map.put("N", 6);
		map.put("O", 6);
		
		map.put("P", 7);
		map.put("Q", 7);
		map.put("R", 7);
		map.put("S", 7);
		
		map.put("T", 8);
		map.put("U", 8);
		map.put("V", 8);
		
		map.put("W", 9);
		map.put("X", 9);
		map.put("Y", 9);
		map.put("Z", 9);
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String ligne = sc.nextLine();
			String result = "";
			for(int i = 0; i < ligne.length(); i++) {
				char carac = ligne.charAt(i);
				if(carac == '-' || carac == '0' || carac == '1') {
					result += carac;
				} else {
					result += map.get("" + carac);
				}
			}
			System.out.println(result);
		}
		
	}

}

