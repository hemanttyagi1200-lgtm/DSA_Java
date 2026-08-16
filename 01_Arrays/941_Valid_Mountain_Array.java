/*
LeetCode 941 - Valid Mountain Array

Approach: Find Maximum + Two-Part Validation

Description:
- Find the maximum element in the array.
- Find the index of the maximum element, which acts as the peak.
- If the peak is at the first or last position, return false.
- Check whether all elements before the peak are strictly increasing.
- Check whether all elements after the peak are strictly decreasing.
- Return true only if both conditions are satisfied.

Time Complexity: O(n)
Space Complexity: O(1)
*/



class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean first = true;
        boolean second = true;
        int maximum = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }

        }
        int n  = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == maximum){
                n = i; 
                break;
                
            }
        }
        if(n == 0 || n == arr.length - 1){
            return false;
        }
        for(int j = 0; j < n ; j++){
            if(arr[j] >= arr[j+1]){
                first = false;

            }

        }

         for(int k = n; k < arr.length - 1 ; k++){
            if(arr[k] <= arr[k+1]){
                second = false;

            }

        }
        return first && second;

        
    }
}