/*
LeetCode 1929 - Concatenation of Array

Approach: Modulo Indexing
Description:
- Create a new array of size 2 * n.
- Traverse the new array from index 0 to 2 * n - 1.
- Use the modulo operator (i % n) to repeatedly access elements
  from the original array.
- Store the corresponding element in the new array.
- Return the concatenated array.

Time Complexity: O(n)
Space Complexity: O(n)
*/




class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i < n * 2; i++){
            ans[i] = nums[i % n];
            

        }
        return ans;
        
    }
}