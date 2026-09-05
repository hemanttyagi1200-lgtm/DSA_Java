/*
 * Problem: 1004. Max Consecutive Ones III
 * Approach: Variable Size Sliding Window
 *
 * Description:
 * Maintain a window containing at most k zeros.
 * Expand the window using the right pointer.
 * If the number of zeros becomes greater than k,
 * shrink the window from the left.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */





class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) count++;
            while(count > k){
                if(nums[left] == 0) count--;
            left++;
            }
            max = Math.max(i - left + 1, max);

        }
        return max;
        
    }
}