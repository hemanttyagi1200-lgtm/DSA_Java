/*
LeetCode 2379 - Minimum Recolors to Get K Consecutive Black Blocks

Approach: Fixed-Size Sliding Window

Description:
- Maintain a window of size k.
- Count the number of 'W' blocks in the window.
- Each 'W' needs one recolor to become 'B'.
- Slide the window by removing the old block and adding the new block.
- Keep track of the minimum number of recolors required.

Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public int minimumRecolors(String blocks, int k) {

        int white = 0;

     
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                white++;
            }
        }

        int answer = white;

     
        for (int i = k; i < blocks.length(); i++) {

           
            if (blocks.charAt(i) == 'W') {
                white++;
            }

      
            if (blocks.charAt(i - k) == 'W') {
                white--;
            }

           
            answer = Math.min(answer, white);
        }

        return answer;
    }
}