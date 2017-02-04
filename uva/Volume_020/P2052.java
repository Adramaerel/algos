import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2052 {

	public static void main(String[] args) throws Exception {

		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		Integer casesNb = Integer.parseInt(entree.readLine());
		for(int i = 0; i < casesNb; i++) {
			String[] input = entree.readLine().split(" ");
			Integer [] imagesX = calculImagesX(Integer.parseInt(input[0]));
			Integer [] imagesY = calculImagesY(Integer.parseInt(input[1]));
			Boolean isPresentInBoth = false;
			Integer common = null;
			for(int j = 0; j < imagesX.length; j++) 
				for (int k = 0; k < imagesY.length; k++) {
					if(imagesX[j].equals(imagesY[k])) {
						isPresentInBoth = true;
						common = imagesX[j];
						break;
					}
				}
			if(isPresentInBoth) {
				System.out.println(common);
			} else {
				System.out.println("No Number");
			}

		}

	}

	private static Integer[] calculImagesY(int y) {
		if(y % 4 == 0) {
			return new Integer []{2 * y, 2 * y + 2};
		}
		if(y % 4 == 1) {
			return new Integer []{2 *y - 1, 2 * y +1};
		}
		if(y % 4 == 2) {
			return new Integer []{2 *y - 1, 2 * y +2};
		}
		if(y % 4 == 3) {
			return new Integer []{2 *y - 1, 2 * y +1};
		}
		return null;
	}

	private static Integer[] calculImagesX(int x) {
		if(x > 1) {
			if(x % 4 == 0) {
				return new Integer [] {2 * x, 2 * x - 2};
			}
			if(x % 4 == 1) {
				return new Integer [] {2 * x - 1, 2 * x - 3};
			}
			if(x % 4 == 2) {
				return new Integer [] {2 * x - 2, 2 * x};
			}
			if(x % 4 == 3) {
				return new Integer [] {2 * x - 3, 2 * x - 1};
			}
		}
		if(x == 0) {
			return new Integer[]{0};
		}
		if(x == 1) {
			return new Integer[]{1};
		}
		return null;
	}



}

