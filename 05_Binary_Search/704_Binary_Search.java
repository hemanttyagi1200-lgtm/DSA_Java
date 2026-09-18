/*
 * LeetCode 704 - Binary Search
 *
 * Approach:
 * Use Binary Search on the sorted array.
 * Compare the target with the middle element:
 * - If nums[mid] == target, return mid.
 * - If nums[mid] < target, search the right half.
 * - If nums[mid] > target, search the left half.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */


class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target)  left = mid + 1;
            else right = mid - 1;
        }
        return -1;
        
    }
}