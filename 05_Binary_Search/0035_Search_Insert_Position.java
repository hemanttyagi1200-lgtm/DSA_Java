// LeetCode 35 - Search Insert Position
// Approach: Binary Search / Lower Bound
//
// Description:
// - Find the first position where nums[index] >= target.
// - If nums[mid] >= target, store mid as a possible answer.
// - Continue searching on the left side for an earlier position.
// - Otherwise, search on the right side.
//
// Time Complexity: O(log n)
// Space Complexity: O(1)


class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int answer = nums.length;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(target <= nums[mid]){
                answer = mid;
                right = mid - 1;
            } 
            else left = mid + 1;
        }
        return answer;
        
    }
}