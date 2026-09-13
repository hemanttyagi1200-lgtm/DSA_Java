// LeetCode 278 - First Bad Version
// Approach: Binary Search
// Description:
// - Versions before the first bad version are good.
// - Versions from the first bad version onward are bad.
// - If mid is bad, search on the left including mid.
// - If mid is good, search on the right of mid.
// - Continue until left and right become equal.
//
// Time Complexity: O(log n)
// Space Complexity: O(1)



/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) right = mid;
            else left = mid + 1;
        }
        return right;
        
    }
}

