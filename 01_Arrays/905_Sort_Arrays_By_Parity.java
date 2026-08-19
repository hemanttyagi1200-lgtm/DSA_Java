/*
LeetCode - Sort Array By Parity

Approach:
- Count the number of even elements.
- Place all even elements at the beginning of the answer array.
- Start placing odd elements from the index equal to the number of even elements.
- Place all odd elements after the even elements.

Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int even_count = 0;
        int slow = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                even_count++;
            }
        }

        int i = 0;

        while(i < nums.length){
            if(nums[i] % 2 == 0){
                ans[slow] = nums[i];
                slow++;
            }
            i++;
        }

        int slow2 = even_count;

        for(int j = 0; j < nums.length; j++){
            if(nums[j] % 2 != 0){
                ans[slow2] = nums[j];
                slow2++;
            }
        }

        return ans;
    }
}