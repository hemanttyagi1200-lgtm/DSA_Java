/*
LeetCode 1051 - Height Checker

Approach: Sorting and Comparison
Description:
- Create a copy of the original heights array.
- Sort the copied array in ascending order.
- Compare the original array with the sorted array element by element.
- If the elements at the same index are different, increment the count.
- Return the total count of positions where the heights differ.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/



class Solution {
    public int heightChecker(int[] heights) {
        int[] copy = heights.clone();
        Arrays.sort(copy);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(copy[i] != heights[i]){
                count++;
            }
        }
        return count;
        
    }
}