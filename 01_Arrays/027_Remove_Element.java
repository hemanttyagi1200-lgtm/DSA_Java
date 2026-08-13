/*
LeetCode 27 - Remove Element

Approach: Two Pointers / Overwrite

Description:
- Initialize two pointers: one pointer (j) to traverse the array
  and another pointer (i) to store valid elements.
- Traverse the array using pointer j.
- If nums[j] is not equal to val, copy nums[j] to nums[i].
- Increment i after storing a valid element.
- If nums[j] is equal to val, skip that element.
- At the end, return i, which represents the number of valid elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}