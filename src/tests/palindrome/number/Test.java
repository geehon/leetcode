package tests.palindrome.number;

import solution.palindrome.number.Solution01;

public class Test {
    public static void main(String[] args) {
        int[] nums = {12321, 1233, 0, -1232, 214748365, 113311};
        Solution01 solution01 = new Solution01();
        boolean tester;
        for (int num : nums) {
            tester = solution01.isPalindrome(num);
            System.out.println(tester);
        }
    }
}
