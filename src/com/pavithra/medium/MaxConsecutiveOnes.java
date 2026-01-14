//485. Max Consecutive Ones
package com.pavithra.medium;

/*brute: TC O(n2), sc O(1)
class Solution2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                int count=0;
                for(int j=i;j<n && nums[j]==1 ;j++){
                    count++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}

 */
//2. Kadane's O(n)
class Solution2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(count, max);
            } else
                count = 0;
        }
        return max;
    }
}
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
Solution2 sol = new Solution2();
int res=sol.findMaxConsecutiveOnes(new int[]{1,1,1,0,1,1,1,1});
System.out.println(res);
    }
}
