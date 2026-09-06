/*
 * LeetCode 1493. Longest Subarray of 1's After Deleting One Element
 *
 * Approach:
 * - Use a variable-size Sliding Window.
 * - Maintain a window containing at most one zero.
 * - Expand the window using the right pointer.
 * - If the window contains more than one zero, move the left pointer
 *   until only one zero remains.
 * - Since exactly one element must be deleted, the valid subarray
 *   length is (i - left).
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */



class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) count++;
            while(count > 1){
                if(nums[left] == 0) count--;
                left++;
                  
            }
            max = Math.max(max, i - left);
        }
        return max;
        
    }
}