/*
LeetCode 1984 - Minimum Difference Between Highest and Lowest of K Scores

Approach: Sorting + Fixed-Size Sliding Window

Description:
- Sort the array.
- Use a window of size k.
- Calculate the difference between the highest and lowest score in each window.
- Keep track of the minimum difference.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/




class Solution {
    public int minimumDifference(int[] nums, int k) {

        Arrays.sort(nums);
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int difference = nums[i + k - 1] - nums[i];
            answer = Math.min(answer, difference);
        }

        return answer;
    }
}