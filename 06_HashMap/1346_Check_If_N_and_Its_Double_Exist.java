// Day 14: Solved LeetCode 1346 - Check If N and Its Double Exist

// Approach: HashSet

// - Used HashSet to store previously visited elements.
// - Checked if double of the current element exists.
// - Checked if half of the current element exists when it is even.
// - Time Complexity: O(n)
// - Space Complexity: O(n)







class Solution {
    public boolean checkIfExist(int[] arr) { 
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(set.contains (2 * arr[i]) || set.contains(arr[i] / 2 ) && (arr[i] % 2==0) ){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
        
    }
}