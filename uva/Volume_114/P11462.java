

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P11462 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer casesNb;
		while((casesNb = sc.nextInt()) > 0) {
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < casesNb; i++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list);
			StringBuilder sb = new StringBuilder("");
			for(int i = 0; i < list.size(); i++) {
				sb.append(list.get(i));
				if(i < list.size() - 1) {
					sb.append(" ");
				}
			}

			System.out.println(sb);
		}

	}

}

