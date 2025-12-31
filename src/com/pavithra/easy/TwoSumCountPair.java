//GFG:Two Sum - Pair with Given Sum
package com.pavithra.easy;
import java.util.Arrays;
import java.util.HashSet;

/*1.Brute Force Approach: TC O(n2), SC:O(1)
class Solution2 {
    int twoSum(int arr[], int target) {
        int n=arr.length;int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target) count++;
            }
        }
        return count;
    }
}
*/

//2.2 pointer ->TC O(n), SC: O(1)
class Solution2 {
    int twoSum(int arr[], int target) {
        int n=arr.length;
        int left=0;int right=n-1;
        int count=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target) {
                count++;
                left++;
                right--;
            }
            else if (sum<target) left++;
            else right--;
        }
        return count;
    }
}

public class TwoSumCountPair {
    public static void main(String[] args) {
Solution2 s=new Solution2();
int res=s.twoSum( new int[]{2,3,4}, 6);
System.out.println(res);
    }
}
