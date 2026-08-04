/*
LeetCode 977 - Squares of a Sorted Array

Approach: Two Pointers

Description:
- Initialize two pointers: one at the beginning (left) and one at the end (right) of the sorted array.
- Since the largest square will always come from the element with the greater absolute value, compare |nums[left]| and |nums[right]|.
- Place the larger square at the current last position of the result array.
- Move the corresponding pointer inward and decrement the result array index.
- Repeat until all elements have been processed.
- Return the sorted array of squared values.

Time Complexity: O(n)
Space Complexity: O(n)  // O(1) auxiliary space excluding the output array
*/




class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans =new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        while(left <= right){
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                ans[index] = nums[right] * nums[right];
                index--;
                right--;
            }else if(Math.abs(nums[left]) > Math.abs(nums[right])){
                ans[index] = nums[left] * nums[left];
                index--;
                left++;
            }else{
                ans[index] = nums[left] * nums[left];
                index--;
                right--;
                
            }
        }
        return ans;
        
    }
}