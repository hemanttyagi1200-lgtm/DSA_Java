/*
 * LeetCode: 3. Longest Substring Without Repeating Characters
 *
 * Approach: Sliding Window + HashMap
 *
 * Description:
 * Find the length of the longest substring without repeating characters.
 * A sliding window is maintained using two pointers, left and right.
 * The HashMap stores the frequency of each character inside the window.
 * If a duplicate character appears, move the left pointer until the
 * window becomes valid again.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(min(n, charset))
 */



class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        int dup_count = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.get(ch) == 2) dup_count++;

            while(dup_count > 0){
                 char ch2 = s.charAt(left);
                map.put(ch2, map.get(ch2) - 1);

                if(map.get(ch2) == 1 ){
                    dup_count--;

                }
                
                if(map.get(ch2) == 0 ){
                    map.remove(ch2);
                }
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
        
    }
}