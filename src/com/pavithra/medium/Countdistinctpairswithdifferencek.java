//GFG:Count distinct pairs with difference k
package com.pavithra.medium;

import java.util.HashSet;

//1.Brute-TC:O(n2), sc:O(n)
class Solution1 {
    public int TotalPairs(int[] nums, int k) {
        int n = nums.length;
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (Math.abs(nums[i] - nums[j]) == k) {

                    int a = Math.min(nums[i], nums[j]);
                    int b = Math.max(nums[i], nums[j]);

                    String pair = a + "," + b;
                    seen.add(pair);   // set ensures distinct pairs
                }
            }
        }
        return seen.size();
    }
}


public class Countdistinctpairswithdifferencek {
    public static void main(String[] args) {
        Solution1 s=new Solution1();
        int res=s.TotalPairs( new int[]{1,3,4,1}, 0);
        System.out.println(res);
    }
}
