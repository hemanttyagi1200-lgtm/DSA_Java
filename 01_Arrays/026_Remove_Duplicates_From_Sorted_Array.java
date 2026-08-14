/*
LeetCode 26 - Remove Duplicates from Sorted Array

Approach: Two Pointers / Overwrite

Description:
- Since the array is sorted, duplicate elements are placed next to each other.
- Use one pointer (i) to traverse the array.
- Use another pointer (a) to keep track of the position where the next unique element should be placed.
- If nums[i] is different from nums[i - 1], it is a unique element.
- Place the unique element at nums[a] and increment a.
- Continue until the entire array is traversed.
- Return a, which represents the number of unique elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/




class Solution {
    public int removeDuplicates(int[] nums) {
        int a = 1;
        int n = nums.length;
        int i = 1;
        while(i < n ){
            if(nums[i] != nums[i - 1]){
                nums[a] = nums[i];
                a++;
                i++;
            }else{
                i++;
              
            }
        }
        return a;
        
    }
}