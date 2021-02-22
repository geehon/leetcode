package tests.two.sum;

import solution.two.sum.Solution01;
import solution.two.sum.Solution02;

public class Test {
    public static void main(String[] args) {
        int[] testNums = {2, 7, 11, 15};
        int testTarget = 9;

        Solution01 solution01 = new Solution01();
        int[] result01 = solution01.twoSum(testNums, testTarget);

        Solution02 solution02 = new Solution02();
        int[] result02 = solution02.twoSum(testNums, testTarget);

        Test tester = new Test();
        tester.printResult(result01);
        tester.printResult(result02);
    }

    private void printResult(int[] input) {
        System.out.println("[" + input[0] + "," + input[1] + "]");
    }
}
