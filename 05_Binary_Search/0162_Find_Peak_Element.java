/**
 * LeetCode 162 - Find Peak Element
 *
 * Approach: Binary Search
 *
 * Description:
 * - Compare nums[mid] with nums[mid + 1].
 * - If nums[mid] > nums[mid + 1], we are on the decreasing side,
 *   so a peak exists at mid or to the left.
 * - Otherwise, we are on the increasing side,
 *   so a peak exists to the right.
 * - Continue until left == right.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */


class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}

