/*
LeetCode 66 - Plus One

Approach: Carry Propagation
Description:
- Start from the last digit of the array.
- Add 1 to the current digit.
- If the digit becomes 10, set it to 0 and carry 1 to the next digit.
- Continue from right to left until the carry becomes 0.
- If all digits are 9, create a new array with an extra position.
- Set the first digit to 1 and the remaining digits to 0.

Time Complexity: O(n)
Space Complexity: O(n) in the worst case
*/





class Solution {
    public int[] plusOne(int[] digits) {
        int count = 0;
        int[] result;
        for(int i = 0; i < digits.length; i++){
            if(digits[i] == 9){
                count++;
            }
        }
        if(count == digits.length){
            result = new int[digits.length + 1];
            int j = 0;
            while(j < result.length){
                if(j == 0){
                    result[j] = 1;
                }else{
                    result[j] = 0;
                }
                j++;
            }
            return result;
        }
        int carry = 1;
        for(int k = digits.length - 1; k >= 0; k--){
            digits[k] = digits[k] + carry;
            carry = digits[k] / 10;
            digits[k] = digits[k] % 10;

        }
        return digits; 
        
            

        
        
    }
}