/*
LeetCode 1423 - Maximum Points You Can Obtain from Cards

Approach: Sliding Window
Description:
- Calculate the total sum of all card points.
- The number of cards that remain in the middle is (n - k).
- Find the minimum sum of a contiguous subarray of size (n - k).
- Use a sliding window to calculate the minimum window sum efficiently.
- Subtract the minimum window sum from the total sum.
- The result is the maximum points that can be obtained by selecting k cards.

Time Complexity: O(n)
Space Complexity: O(1)
*/



