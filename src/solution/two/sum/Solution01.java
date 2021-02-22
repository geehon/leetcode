package solution.two.sum;

public class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp - nums[j] == 0) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
