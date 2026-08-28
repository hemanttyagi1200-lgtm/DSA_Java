
/*
LeetCode 1052 - Grumpy Bookstore Owner

Approach: Sliding Window

Description:
- Count customers who are already satisfied.
- Calculate extra satisfied customers in the first window.
- Slide the window to find the maximum extra customers.
- Return already satisfied + maximum extra satisfied.

Complexity:
- Time Complexity: O(n)
- Space Complexity: O(1)
*/




class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int alreadySatisfied = 0;
        for(int i = 0; i < customers.length; i++){
            if(grumpy[i] == 0){
                alreadySatisfied = alreadySatisfied + customers[i];
            }
        }
        int extraSatisfied = 0;
        for(int i = 0; i < minutes; i++){
            if(grumpy[i] == 1){
                extraSatisfied = extraSatisfied + customers[i];
            }
        }
        int max = extraSatisfied;
        for(int i = 1; i <= customers.length - minutes; i++){
            if(grumpy[i - 1] == 1)
                extraSatisfied -= customers[i - 1];

            if(grumpy[i + minutes - 1] == 1)
                extraSatisfied += customers[i + minutes - 1];
            if(extraSatisfied > max){
                max = extraSatisfied;
            }
        }
        return alreadySatisfied + max;


        
    }
}






