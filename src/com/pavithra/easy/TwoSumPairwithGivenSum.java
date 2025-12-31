//GFG:Two Sum - Pair with Given Sum
package com.pavithra.easy;
import java.util.Arrays;
import java.util.HashSet;

//1.Brute Force Approach: TC O(n2), SC:O(1)
/*
class Solution {
    boolean twoSum(int arr[], int target) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target) return true;
            }
        }
        return false;
    }
}
/*

/*2.2 pointer ->TC O(nlogn), SC: O(1)
class Solution {
    boolean twoSum(int arr[], int target) {
        int n=arr.length;
        int left=0;int right=n-1;
        Arrays.sort(arr);
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target) return true;
            else if (sum<target) left++;
            else right--;
        }
        return false;
    }
}
*/

//HashSet Optimize TC,SC:O(n)
class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            int previous_num=target-num;
            if(set.contains(previous_num)) return true;
            set.add(num);
        }
        return false;

    }
}

public class TwoSumPairwithGivenSum {
    public static void main(String[] args) {
Solution s=new Solution();
boolean res=s.twoSum( new int[]{2,3,4}, 6);
System.out.println(res);
    }
}
