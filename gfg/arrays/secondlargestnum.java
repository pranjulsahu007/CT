
class Solution {
    static int max = 0;
    static int index = 0;

    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Find the largest number
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Find the second largest number
        for (int num : arr) {
            if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        return secondMax;
    }
}