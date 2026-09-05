/*
 * Problem: 713. Subarray Product Less Than K
 * Approach: Variable Size Sliding Window
 *
 * Description:
 * Maintain a sliding window whose product is less than k.
 * Expand the window using the right pointer.
 * If the product becomes greater than or equal to k,
 * shrink the window from the left.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */



class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) {
            return 0;
        }

        int left = 0;
        int product = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            product = product * nums[right];

            while (product >= k) {
                product = product / nums[left];
                left++;
            }

            count = count + (right - left + 1);
        }

        return count;
    }
}