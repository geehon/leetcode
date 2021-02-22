package tests.reverse.integer;

import solution.reverse.integer.Solution01;

public class Test {
    public static void main(String[] args) {
        // define testData num
        int[] nums = {Integer.MIN_VALUE, 1233, 0, -1232, 214748365, Integer.MAX_VALUE};
        Solution01 solution01 = new Solution01();
        int tester;
        for (int num : nums) {
            tester = solution01.reverse(num);
            System.out.println(tester);
        }
    }
}
