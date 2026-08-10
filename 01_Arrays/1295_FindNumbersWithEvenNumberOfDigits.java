/*
LeetCode 1295 - Find Numbers with Even Number of Digits

Approach 1: Math.log10()
- Calculate the number of digits using logarithm.
- Check if the digit count is even.

Time Complexity: O(n)
Space Complexity: O(1)


*/ 


class Solution {
    public int findNumbers(int[] nums) {
        int evencount = 0;
        for(int i = 0; i < nums.length; i++){
            int digitcount = (int) Math.floor(Math.log10(nums[i]) + 1);
            if(digitcount % 2 == 0){
                evencount++;
            }
        }
        return evencount;
        
    }
}




/* 


Approach 2: While Loop
- Repeatedly divide the number by 10.
- Each division removes one digit.
- Count the number of digits and check if it is even.

Time Complexity: O(n * d)
Space Complexity: O(1)
*/



class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0;i < nums.length ; i++){
            int digit = 0;
            while(nums[i] != 0){
                nums[i] = nums[i] / 10;
                digit++;
                
            }
            if(digit % 2 == 0){
                    count ++;
                }
        }
        return count;
        
    }
}