//438. Find All Anagrams in a String
package com.pavithra.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//2.Sliding window
class Solution6 {
    public List<Integer> findAnagrams(String s, String p) {
        int[] scount=new int[26];
        int[] pcount=new int[26];
        List<Integer> result= new ArrayList<>();
        for(char c:p.toCharArray()){
            pcount[c-'a']++;
        }
        for(int rightPointer=0;rightPointer<s.length();rightPointer++){
            scount[s.charAt(rightPointer)-'a']++;

            if(rightPointer>=p.length()){
                scount[s.charAt(rightPointer-p.length())-'a']--;
            }
            if(Arrays.equals(scount,pcount)){
                result.add(rightPointer-p.length()+1);
            }
        }
        return result;
    }
}
public class anagram {
    public static void main(String[] args) {
Solution6 sol = new Solution6();
List<Integer> res=sol.findAnagrams("cbaebabacd","abc");
System.out.println(res);
    }
}
