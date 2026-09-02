/*
LeetCode 209 - Minimum Size Subarray Sum

Approach: Variable Size Sliding Window

Description:
- Use two pointers, left and right, to maintain a sliding window.
- Expand the window by moving right.
- When the sum becomes greater than or equal to target,
  shrink the window from the left.
- Track the minimum window length.

Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum = sum + nums[right];

            while (sum >= target) {

                int length = right - left + 1;

                minLen = Math.min(minLen, length);

                sum = sum - nums[left];

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }

        return minLen;
    }
}