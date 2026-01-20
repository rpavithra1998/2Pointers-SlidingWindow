//1423. Maximum Points You Can Obtain from Cards
package com.pavithra.medium;
/*1.brute TC: O(k2), SC:O(1)
class Solution5 {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int max =0;
        for(int i=0;i<=k;i++){
            int sum=0;
            for(int l=0;l<i;l++){
                sum+=cardPoints[l];
            }
            for(int r=n-(k-i);r<n;r++){
                sum+=cardPoints[r];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}

 */
//sliding window: TC :0(k),sc:O(1)
class Solution5 {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int max =0;int sumKel=0;
        for(int i=0;i<k;i++){
            sumKel=sumKel+cardPoints[i];
        }
        int i=0;
        max=sumKel;
        while(i<k){
            sumKel=sumKel-cardPoints[k-i-1]+cardPoints[n-1-i];
            max=Math.max(max,sumKel);
            i++;
        }
        return max;
    }
}
public class MaximumPoints {
    public static void main(String[] args) {
Solution5 sol = new Solution5();
int res=sol.maxScore(new int[]{1,2,3,4,5,6,7,8,9,10},3);
System.out.println(res);
    }
}
