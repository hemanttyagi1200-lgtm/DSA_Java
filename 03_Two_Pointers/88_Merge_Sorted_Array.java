/*
LeetCode 88 - Merge Sorted Array

Approach: Two Pointers
Description:

- Initialize two pointers at the end of both arrays.
- Compare the elements pointed to by p1 and p2.
- Place the larger element at the end of nums1.
- Move the corresponding pointer backward.
- Continue until all elements of nums2 are merged.

Time Complexity: O(m + n)
Space Complexity: O(1)
*/


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;

        for (int p = m + n - 1; p >= 0; p--) {

            if (p2 < 0) {
                break;
            }

            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
        }
    }
}