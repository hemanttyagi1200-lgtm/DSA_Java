/*
LeetCode 643 - Maximum Average Subarray I

Approach: Sliding Window
Description:
- Calculate the sum of the first k elements to create the initial window.
- Calculate the average of the first window and store it as the maximum average.
- Slide the window one position at a time.
- Remove the element leaving the window and add the new element entering the window.
- Calculate the average of the updated window.
- Update the maximum average if the current average is greater.
- Repeat until all possible windows are checked.

Time Complexity: O(n)
Space Complexity: O(1)
*/



class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double current = 0;
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }
        current = sum / k;
        double max_avg = current;

        for(int j = 1; j <= nums.length - k; j++){
            sum = sum - nums[j - 1] + nums[j + k - 1];
            current = sum / k;
            if(current > max_avg){
                max_avg = current;
            }
        }
        return max_avg;
        
    }
}