// LeetCode 34 - Find First and Last Position of Element in Sorted Array
// Approach: Binary Search
//
// Description:
// - Use one binary search to find the first occurrence.
// - Use another binary search to find the last occurrence.
// - When target is found, continue searching instead of stopping.
//
// Time Complexity: O(log n)
// Space Complexity: O(1)



class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int answer1 = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                answer1 = mid;
                right = mid - 1;
            }else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        left = 0;
        right = nums.length - 1;
        int answer2 = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                answer2 = mid;
                left = mid + 1;
            }else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return new int[] {answer1,answer2};
    }
}