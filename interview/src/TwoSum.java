import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] aArr = new int[4];
        aArr[0] = 2;
        aArr[1] = 7;
        aArr[2] = 11;
        aArr[3] = 15;

        int[] bArr = new int[3];
        bArr[0] = 3;
        bArr[1] = 2;
        bArr[2] = 4;

        int[] cArr = new int[2];
        cArr[0] = 3;
        cArr[1] = 3;

        System.out.println(Arrays.toString(twoSumV2(aArr, 9)));
        System.out.println(Arrays.toString(twoSumV2(bArr, 6)));
        System.out.println(Arrays.toString(twoSumV2(cArr, 6)));
    }

    // BETTER Solution
    public static int[] twoSumV2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[] { i, j };
                }
            }
        }

        return null;
    }

    // BAD Solution
    public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int x = nums[i];
                int y = nums[j];

                if ((x + y) == target && i < j) {
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }

        return ret;
    }
}
