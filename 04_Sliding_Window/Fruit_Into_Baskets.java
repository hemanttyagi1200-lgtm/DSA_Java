/*
 * Problem: 904. Fruit Into Baskets
 * Approach: Variable Size Sliding Window + HashMap
 *
 * Description:
 * Maintain a window containing at most 2 different fruit types.
 * Expand the window using the right pointer.
 * If more than 2 fruit types are present,
 * shrink the window from the left.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < fruits.length; i++){
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            while(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            max =Math.max(max, i - left + 1);

        }
        return max;
    }
}