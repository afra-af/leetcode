/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] r1=s.toCharArray();
        char[] r2=t.toCharArray();
        Arrays.sort(r1);
        Arrays.sort(r2);
        boolean res=Arrays.equals(r1,r2);
        if(res){
            return true;
        }
        return false;
        
}
}
