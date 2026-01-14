//11. Container With Most Water
package com.pavithra.medium;

/*Brute, TC:O(n2),SC: O(1)
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, area);
            }
        }
        return max;
    }
}
 */

//2.2 pointers TC:O(n) sc:O(1)
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int left=0; int right=height.length-1;
        while(left<right){
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);

            if(height[left]<height[right]) left++;
            else right--;
        }
        return max;
    }
}
public class ContainerWater {
    public static void main(String[] args) {
  Solution s=new Solution();
 int res= s.maxArea( new int[]{1,8,6,2,5,4,8,3,7});
 System.out.println(res);
    }
}
