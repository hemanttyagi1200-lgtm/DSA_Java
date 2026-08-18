/*
LeetCode 283 - Move Zeroes

Approach: Two Pointers
Description:
- Use a slow pointer to track the position where the next non-zero element should be placed.
- Traverse the array using another pointer.
- If the current element is non-zero, place it at the slow pointer position.
- Count the total number of zeroes in the array.
- After moving all non-zero elements to the front, fill the remaining positions with zeroes.
- Maintain the relative order of all non-zero elements.
- Modify the array in-place without using extra space.

Time Complexity: O(n)
Space Complexity: O(1)
*/



class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
            }
        }
        int last = nums.length  - count;

        int i = 0;
        while(i < nums.length){
            if(nums[i] != 0){
                nums[slow] = nums[i];
                slow++;
                i++;
            }else{
                i++;
                
                
            }
        }

        for(int j = last; j < nums.length; j++){
            nums[j] = 0;

        }
        return ;
    }
}