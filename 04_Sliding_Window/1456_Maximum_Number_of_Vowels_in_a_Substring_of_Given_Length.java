/*
LeetCode 1456 - Maximum Number of Vowels in a Substring of Given Length

Approach: Fixed-Size Sliding Window
Description:
- Count the number of vowels in the first window of size k.
- Store this count as the initial maximum.
- Slide the window one character at a time.
- Remove the leftmost character from the window if it is a vowel.
- Add the new rightmost character if it is a vowel.
- Update the maximum vowel count after each window.
- Return the maximum number of vowels found in any window of size k.

Time Complexity: O(n)
Space Complexity: O(1)
*/



class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        int max = count;
        for(int j = 1; j <= s.length() - k; j++){
            char left = s.charAt(j - 1);
            if (left == 'a' || left == 'e' || left == 'i' ||left == 'o' || left == 'u'){
                count--;
            }
            char right = s.charAt(j + k - 1);
             if (right == 'a' || right == 'e' || right == 'i' ||right == 'o' || right == 'u'){
                count++;
            }
            if(count > max){
                max = count;
            }
        }
        return max;

        

        
    }
}