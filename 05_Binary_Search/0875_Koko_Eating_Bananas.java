/*
LeetCode 875 - Koko Eating Bananas

Approach:
Binary Search on Answer

Description:
- Search for the minimum eating speed Koko needs.
- The minimum possible speed is 1.
- The maximum possible speed is the largest pile.
- For each middle speed, calculate the total hours required.
- If the required hours are within h, try a smaller speed.
- Otherwise, increase the speed.

Time Complexity: O(n log m)
Space Complexity: O(1)
*/


class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > right) {
                right = piles[i];
            }
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            long hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;
            }

            if (hours <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}