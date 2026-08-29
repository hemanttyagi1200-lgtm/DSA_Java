
/*
LeetCode 2461 - Maximum Sum of Distinct Subarrays With Length K

Approach: Sliding Window + HashMap

Description:
- Maintain a window of size k.
- Use a HashMap to store the frequency of each element.
- Maintain the sum of the current window.
- Slide the window by removing the outgoing element and adding the incoming element.
- If the window contains k distinct elements, update the maximum sum.

Complexity:
- Time Complexity: O(n)
- Space Complexity: O(k)
*/





class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long max = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if(map.size() == k){
            max = sum;
        }

        for(int i = 1; i <= nums.length - k; i++){

            int remove = nums[i - 1];
            map.put(remove, map.get(remove) - 1);

            if(map.get(remove) == 0){
                map.remove(remove);
            }

            int add = nums[i + k - 1];
            map.put(add, map.getOrDefault(add, 0) + 1);

            sum = sum - remove + add;

            if(map.size() == k){
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}

