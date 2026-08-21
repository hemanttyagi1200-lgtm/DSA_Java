/*
LeetCode 448 - Find All Numbers Disappeared in an Array

Approach: Index Marking
Description:
- Traverse the array and use each number as an index.
- Use Math.abs(nums[i]) - 1 to get the correct index.
- Mark the value at that index as negative to indicate that the number exists.
- Traverse the array again.
- If an element is still positive, its corresponding index + 1 is missing.
- Add all missing numbers to the result list.

Time Complexity: O(n)
Space Complexity: O(1) auxiliary space
*/



class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);

        }
         for(int j = 0; j < nums.length; j++){
            if(nums[j] > 0){
                result.add(j + 1);
            }

         }
         return result;
    }
}