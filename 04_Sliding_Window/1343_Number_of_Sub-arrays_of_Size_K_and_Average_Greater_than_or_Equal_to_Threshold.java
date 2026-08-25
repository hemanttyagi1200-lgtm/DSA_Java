/*
LeetCode 1343 - Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

Approach: Sliding Window
Description:
- Calculate the sum of the first k elements to create the initial window.
- Check whether the average of this window is greater than or equal to the threshold.
- Slide the window one position at a time.
- Remove the element leaving the window and add the new element entering the window.
- Check the average of each new window and increment the count if it satisfies the condition.
- Return the total count of valid subarrays.

Time Complexity: O(n)
Space Complexity: O(1)
*/



class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        double sum = 0;
        double current = 0;
        int count = 0;
        for(int i= 0; i < k; i++){
            sum = sum + arr[i];
        }
         if((sum / k) >= threshold){
                count++;
            }
        current = sum / k;
        double avg = current;
        for(int j = 1; j <= arr.length - k; j++){
            sum = sum - arr[j - 1] + arr[j + k - 1];
            avg = sum / k;
            if(avg >= threshold){
                count++;
            }
        }
        return count;

    }
}