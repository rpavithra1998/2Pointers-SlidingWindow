//3.Longest Substring Without Repeating Characters
package com.pavithra.easy;

import java.util.HashSet;
import java.util.Set;

/*1.brute: time o(n2), SC: O(n)
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLength=0;
        for(int i=0;i<n;i++){
            Set<Character> seen=new HashSet<>();
            for(int j=i;j<n;j++){
                if(seen.contains(s.charAt(j))) break;
                seen.add(s.charAt(j));
                maxLength=Math.max(maxLength,j-i+1);
            }
        }
        return maxLength;
    }
}
*/
//2 pointers
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
Solution3 sol=new Solution3();
System.out.println(sol.lengthOfLongestSubstring("bbbbb"));
    }
}
