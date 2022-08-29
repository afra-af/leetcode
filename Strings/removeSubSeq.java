/*
Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

Example 1:

Input:
S = aabb
Output:  ab 
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.

*/
class Solution{
    public String removeConsecutiveCharacter(String S){
        int n=S.length();
        String res=" ";
        for(int i=0;i<n;i++){
            if(i<n-1 && S.charAt(i)==S.charAt(i+1))
            continue;
            else
            res+=S.charAt(i);
        }
        return res.trim();
    }
    
        

}
