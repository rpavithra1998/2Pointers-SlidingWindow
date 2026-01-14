//1004. Max Consecutive Ones III
package com.pavithra.medium;

/*brute: TC O(n2), sc O(1)
class Solution3 {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;int maxlen=0;
        for(int i=0;i<n;i++){
            int zerocount=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0) zerocount++;
                if(zerocount>k) break;
                maxlen=Math.max(maxlen,j-i+1);
            }
        }
        return maxlen;
    }
*/
//2 pointer TC:O(n)
class Solution3 {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;int maxlen=0; int zerocount=0;
        int start=0;
        for(int end=0;end<n;end++){

            if(nums[end]==0) zerocount++;
            while(zerocount>k) {
                if(nums[start]==0)
                    zerocount--;
                start++;
            }
            maxlen=Math.max(maxlen,end-start+1);

        }
        return maxlen;
    }
}
public class MaxConsOnesIII {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int res=sol.longestOnes(new int[]{1,1,1,0,1,1,1,1,0,0},2);
        System.out.println(res);
    }
}
