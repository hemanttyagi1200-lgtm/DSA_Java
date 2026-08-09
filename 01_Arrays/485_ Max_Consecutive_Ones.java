/*
LeetCode 485 - Max Consecutive Ones

Approach:
- Maintain a count of consecutive 1s.
- When a 0 is encountered, reset the count to 0.
- Keep track of the maximum count using Math.max().

Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maximum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count += 1;
            }else{
                maximum = Math.max(count, maximum);
                count = 0;
            }
        }
        return Math.max(count, maximum);
        
    }
}