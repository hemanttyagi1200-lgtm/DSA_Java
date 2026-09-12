/*
LeetCode 33 - Search in Rotated Sorted Array

Approach:

* Use Binary Search.
* Check if the middle element is the target.
* Determine which half of the array is sorted.
* If the target lies inside the sorted half, search there.
* Otherwise, search in the other half.

Description:

* The array is sorted but rotated at some pivot.
* At every step, at least one half of the current range is sorted.
* Use the sorted half to decide where the target can exist.
* Reduce the search space by half in every iteration.

Time Complexity: O(log n)
Space Complexity: O(1)
*/




class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]) right = mid - 1;
                else left = mid + 1;
            }else{
                if(nums[mid] < target && target <= nums[right]) left = mid + 1;
                else right = mid - 1;
            }
            

        }
        return -1;
        
    }
}
