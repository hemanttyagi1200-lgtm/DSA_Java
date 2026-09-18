/**
 * LeetCode 852 - Peak Index in a Mountain Array
 *
 * Approach: Binary Search
 *
 * Description:
 * - The array first increases and then decreases.
 * - If arr[mid] < arr[mid + 1], we are on the increasing side,
 *   so the peak must be on the right.
 * - Otherwise, we are on the decreasing side or at the peak,
 *   so we move right to mid.
 * - When left == right, the peak index is found.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */



class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1])  left = mid + 1;
            else right = mid; 
        }

        return left;
    }
}