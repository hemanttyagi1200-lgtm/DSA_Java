/*
LeetCode 1089 - Duplicate Zeros

Approach: In-Place Array Manipulation
Description:

- Count the number of zeros that can be duplicated without exceeding the array size.
- Find the last index of the original elements that need to be processed.
- Traverse the array from right to left.
- For a non-zero element, shift it to its new position.
- For a zero, place it twice at the appropriate positions.
- Handle the edge case where a zero falls at the last available position.
- Modify the array in-place without using extra space.

Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public void duplicateZeros(int[] arr) {
        int zeroDups = 0;
        int lastIdx = arr.length - 1;
        for(int i = 0; i <= lastIdx - zeroDups; i++){
            if(arr[i] == 0){
                if(i == (lastIdx - zeroDups)){
                    arr[lastIdx] = 0;
                    lastIdx--;
                    break;

                }
                zeroDups++;
            }
        } 
        int newLastIdx = lastIdx - zeroDups;
        for(int i = newLastIdx ; i >= 0; i--){
            if(arr[i] == 0){
                arr[i + zeroDups] = 0;
                zeroDups--;
                arr[i + zeroDups] = 0;
            }else{
                arr[i + zeroDups] = arr[i];
            }
        }
        
    }
}