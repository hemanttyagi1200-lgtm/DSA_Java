/*
LeetCode 231 - Power of Two

Approach: Iterative Division
Description:
- If the number is less than 1, it cannot be a power of two.
- Repeatedly divide the number by 2 while it is evenly divisible by 2.
- After the loop, if the number becomes 1, it is a power of two.
- Otherwise, it is not a power of two.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            while (n % 2 == 0) {
                n = n / 2;
            }

            return n == 1;
        }
    }
}