/*
LeetCode 1299 - Replace Elements with Greatest Element on Right Side

Approach: Traverse from Right to Left

Description:
- Create a new array to store the result.
- Start traversing the array from the right side.
- Maintain a variable `rightmax` to store the greatest element seen so far.
- Store `rightmax` in `ans[i]` because it represents the greatest element to the right of arr[i].
- Update `rightmax` using Math.max(arr[i], rightmax).
- The last element gets -1 because there is no element on its right.

Time Complexity: O(n)
Space Complexity: O(n)
*/


class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int rightmax = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            ans[i] = rightmax;
            rightmax = Math.max(arr[i],rightmax);
        }
        return ans;
        
    }
}