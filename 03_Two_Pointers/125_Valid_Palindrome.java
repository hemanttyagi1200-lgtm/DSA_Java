/*
LeetCode 125 - Valid Palindrome

Approach: Two Pointers
Description:
- Remove all non-alphanumeric characters from the string.
- Convert the string to lowercase to make the comparison case-insensitive.
- Initialize two pointers: one at the beginning and one at the end of the string.
- Compare the characters at both pointers.
- If they are equal, move both pointers towards the center.
- If they are not equal, the string is not a palindrome.
- Continue until the pointers meet or cross.

Time Complexity: O(n)
Space Complexity: O(n)
*/



class Solution {
    public boolean isPalindrome(String s) {
        boolean palindrome = false;
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
                palindrome = true;
            }else{
            return false;

        }
        }
        if(palindrome == true){
            return true;
        }
        return true;
        
    }
}