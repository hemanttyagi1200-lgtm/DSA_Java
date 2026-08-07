/*
LeetCode 242 - Valid Anagram

Approach: HashMap / Frequency Counting
Description:
- First, check if both strings have the same length.
- Create two HashMaps to store the frequency of each character.
- Traverse both strings and count the occurrences of each character.
- Compare the two HashMaps.
- If both maps are equal, the strings are anagrams.

Time Complexity: O(n)
Space Complexity: O(n)
*/


public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
    }
}