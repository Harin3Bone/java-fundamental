import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectTwoList {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 2, 3, 6, 7, 9, 11 };
		int[] arr2 = new int[] { 4, 6, 9, 12 };

		System.out.println(Arrays.toString(findIntersection(arr1, arr2)));
		System.out.println(Arrays.toString(findIntersectionV2(arr1, arr2)));
	}

	// Version 2
	public static int[] findIntersectionV2(int[] arr1, int[] arr2) {
		List<Integer> ret = new ArrayList<>();		
		HashSet<Integer> set = new HashSet<>();
		
		for (int arr : arr1) {
			set.add(arr);
		}
		
		for (int arr : arr2) {
			if (set.contains(arr)) {
				ret.add(arr);
			}
		}
		

		return ret.stream().mapToInt(i -> i).toArray();
	}

	// Version 1
	public static int[] findIntersection(int[] arr1, int[] arr2) {
		List<Integer> ret = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					ret.add(arr1[i]);
				}
			}
		}
		return ret.stream().mapToInt(i -> i).toArray();
	}

}
