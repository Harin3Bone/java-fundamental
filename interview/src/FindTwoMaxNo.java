import java.util.Arrays;
import java.util.List;

public class FindTwoMaxNo {

	public static void main(String[] args) {
		int[] no1 = new int[] { 7, 3, 2, 5, 7, 4, 9, 9 };
		int[] no2 = new int[] { -1, -5, 1, 2, 3, 9 };
		int[] no3 = new int[] { 0, 1, 2, 3, 4, 5 };
		int[] no4 = new int[] { 0, 10, 2, 9, 4, 5 };
		int[] no5 = new int[] { -1, -3, -9, -5 };

		System.out.println(Arrays.toString(findTwoMax(no1)));
		System.out.println(Arrays.toString(findTwoMax(no2)));
		System.out.println(Arrays.toString(findTwoMax(no3)));
		System.out.println(Arrays.toString(findTwoMax(no4)));
		System.out.println(Arrays.toString(findTwoMax(no5)));
	}

	// Version 1
	public static int[] findTwoMax(int[] no) {
		int maxOne = Integer.MIN_VALUE;
		int maxTwo = Integer.MIN_VALUE;

		for (int num : no) {
			if (maxOne < num) {
				maxTwo = maxOne;
				maxOne = num;
			} else if (maxTwo < num && num < maxOne) {
				maxTwo = num;
			}
		}

		return new int[] { maxOne, maxTwo };
	}

	// Version 2
	public static List<Integer> findTwoMax(List<Integer> no) {
		int maxOne = Integer.MIN_VALUE;
		int maxTwo = Integer.MIN_VALUE;

		for (int num : no) {
			if (maxOne < num) {
				maxTwo = maxOne;
				maxOne = num;
			} else if (maxTwo < num && num < maxOne) {
				maxTwo = num;
			}
		}

		return Arrays.asList(maxOne, maxTwo);
	}
}
