//GFG:Count distinct pairs with difference k
package com.pavithra.medium;

import java.util.Arrays;
import java.util.HashSet;

/*1.Brute-TC:O(n2), sc:O(n)
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
*/

//2 pointers: Tc:O(nlogn), SC:O(1)
class Solution1 {
    public int TotalPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0,j=1; int count=0;
        while(i<n && j<n){
            if(i==j){
                j++;
                continue;
            }
            int diff=nums[j]-nums[i];
            if(diff==k){
                count++;
                int a=nums[i];
                int b=nums[j];
                while(i<n && nums[i]==a) i++;
                while(j<n && nums[j]==b) j++;
            }
            else if(diff<k) j++;
            else i++;
        }
        return count;
    }
}

//3. Time:O(n), sc:O(n)
public class Countdistinctpairswithdifferencek {
    public static void main(String[] args) {
        Solution1 s=new Solution1();
        int res=s.TotalPairs( new int[]{1,3,4,1}, 0);
        System.out.println(res);
    }
}
