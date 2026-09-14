/*
LeetCode 69. Sqrt(x)

Approach: Binary Search

Description:
- Find the largest integer whose square is less than or equal to x.
- Use Binary Search between 0 and x.
- If mid <= x / mid, mid is a valid answer, so move left forward.
- Otherwise, mid is too large, so move right backward.
- Use x / mid instead of mid * mid to avoid integer overflow.

Time Complexity: O(log x)
Space Complexity: O(1)
*/


class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int answer = 0;
        if(x < 2) return x;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mid  <= x / mid){
                answer = mid;
                left = mid + 1;
            }else right = mid - 1;

        }
        return answer;
        
    }
}