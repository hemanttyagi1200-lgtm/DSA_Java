/*
LeetCode 344 - Reverse String

Approach: Two Pointers

Description:
- Initialize two pointers: one at the beginning (left) and one at the end (right) of the character array.
- Swap the characters at the left and right pointers.
- Move the left pointer forward and the right pointer backward.
- Continue until the two pointers meet or cross.
- The string is reversed in place without using any extra array.

Time Complexity: O(n)
Space Complexity: O(1)
*/



class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        
        
    }
}
