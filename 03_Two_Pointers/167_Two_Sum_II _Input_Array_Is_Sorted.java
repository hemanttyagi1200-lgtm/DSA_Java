/*
LeetCode 167 - Two Sum II - Input Array Is Sorted

Approach: Two Pointers
Description:
- Initialize two pointers: one at the beginning and one at the end of the sorted array.
- Calculate the sum of the two numbers.
- If the sum equals the target, return their 1-based indices.
- If the sum is smaller than the target, move the left pointer to increase the sum.
- If the sum is greater than the target, move the right pointer to decrease the sum.
- Repeat until the pair is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left +1 , right +1};

            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
        
        
    }
}