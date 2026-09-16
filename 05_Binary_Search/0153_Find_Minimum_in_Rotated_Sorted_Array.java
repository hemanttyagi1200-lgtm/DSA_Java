/**
 * LeetCode 153 - Find Minimum in Rotated Sorted Array
 *
 * Approach: Binary Search
 *
 * Description:
 * - Use binary search to reduce the search space.
 * - Store the minimum value found in answer.
 * - If nums[mid] > nums[right], search the right half.
 * - Otherwise, search the left half.
 * - Since right = mid - 1, while (left <= right) can be used.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */



class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int answer = nums[0];

        while (left <= right) {
            int mid = left + (right - left) / 2;
            answer = Math.min(answer, nums[mid]);
            if (nums[mid] > nums[right]) left = mid + 1;
            else right = mid - 1;
        }

        return answer;
    }
}