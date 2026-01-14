//287. Find the Duplicate Number
package com.pavithra.medium;
import java.util.HashSet;

/*1.Sorting + 2 Pointers
TC:O(nlogn),sc:O(1)
import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Compare adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];   // duplicate found
            }
        }

        return -1; // safety (should not happen)
    }
}
 */

/* using hashset lookup-> TC:SC:O(n) takes extra space as well

class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return -1;
    }
}
*/

public class FindDuplicate {

}
