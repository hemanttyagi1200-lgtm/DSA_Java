
/*
LeetCode 2090 - K Radius Subarray Averages

Approach: Sliding Window

Description:
- Initialize the answer array with -1.
- Calculate the window size as 2 * k + 1.
- Calculate the sum of the first window.
- Use a sliding window to remove the outgoing element and add the incoming element.
- Calculate the average for each valid center position.

Complexity:
- Time Complexity: O(n)
- Space Complexity: O(n)
*/


class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        int window = 2 * k + 1;

        if(window > n){
            return ans;
        }

        long sum = 0;

        for(int i = 0; i < window; i++){
            sum += nums[i];
        }

        ans[k] = (int)(sum / window);

        for(int i = window; i < n; i++){
            sum = sum - nums[i - window] + nums[i];
            ans[i - k] = (int)(sum / window);
        }

        return ans;
    }
}


