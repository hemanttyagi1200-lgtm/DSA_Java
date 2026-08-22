/*
LeetCode 414 - Third Maximum Number

Approach: Sorting and HashSet
Description:
- Sort the array in ascending order.
- Reverse the array to process elements from largest to smallest.
- Use a HashSet to store unique elements and ignore duplicates.
- Count the unique elements while traversing the array.
- When the 3rd unique maximum is found, return it.
- If there are fewer than 3 distinct elements, return the maximum element.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/



class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int first = 0;
        int second = nums.length - 1;
        int count = 0;
        while( first < second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
            first++;
            second--;
        }
        if(nums.length > 2){
            for(int i = 0; i < nums.length; i++){
                if(!set.contains(nums[i])){
                    set.add(nums[i]);
                    count++;
                    if(count == 3){
                        return nums[i];
                    }
                }
            }
        }
        
        return nums[0];
        
    }
}