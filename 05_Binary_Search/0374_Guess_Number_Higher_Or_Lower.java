/*
LeetCode 374 - Guess Number Higher or Lower

Approach:
Binary Search

Description:
- Search for the picked number between 1 and n.
- Use the guess() API to determine which half to eliminate.
- If guess(mid) == 0, mid is the picked number.
- If guess(mid) == 1, the picked number is higher, so move left to mid + 1.
- Otherwise, the picked number is lower, so move right to mid - 1.

Time Complexity: O(log n)
Space Complexity: O(1)
*/


public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(guess(mid) == 0)
            return mid;
            else if(guess(mid) == 1)
            left = mid + 1;
            else
            right = mid - 1;
        }
        return 0;
    }
}