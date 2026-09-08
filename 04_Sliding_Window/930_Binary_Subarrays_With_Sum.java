/*
 * LeetCode 930 - Binary Subarrays With Sum
 *
 * Approach:
 * Sliding Window / Prefix-based counting
 *
 * Description:
 * Count the number of non-empty subarrays whose sum is equal to goal.
 *
 * For goal == 0:
 * Since the array contains only 0s and 1s, a valid subarray
 * must contain only zeros.
 *
 * zeros = number of consecutive zeros ending at the current index.
 * Every time we encounter a zero, zeros increases by 1.
 * The number of new valid subarrays ending at the current index
 * is exactly zeros.
 *
 * If we encounter a 1, the consecutive-zero sequence breaks,
 * so zeros is reset to 0.
 *
 * count += zeros;
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */



class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if(goal == 0){
            int count = 0;
            int zeros = 0;

            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                zeros++;
                } else {
                zeros = 0;
                }

             count += zeros;
        }

    return count;
}
        int left = 0;
        int sum = 0;
        int count1 = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            while(sum > goal){
                sum = sum - nums[left];
                left++;
            }
            count1 += i - left + 1;
        }

        sum = 0;
        left = 0;
        int count2 = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            while(sum > goal - 1){
                sum = sum - nums[left];
                left++;
            }
            count2 += i - left + 1;
        }
        return count1 - count2;
        
    }
}