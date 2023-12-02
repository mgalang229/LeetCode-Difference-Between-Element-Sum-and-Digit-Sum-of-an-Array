class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0, digitSum = 0;
        for (int x : nums) {
            elementSum += x;
            digitSum += getSumDigit(x);
        }
        return Math.abs(elementSum - digitSum);
    }
    
    static int getSumDigit(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
