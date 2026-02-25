// Last updated: 2/25/2026, 9:10:55 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLength=0;
        Set<Character> charSet=new HashSet<>();
        int left=0;
        for(int r=0;r<n;r++){
            if(!charSet.contains(s.charAt(r))){
                charSet.add(s.charAt(r));
                maxLength=Math.max(maxLength,r-left+1);
            }

            else{
                while(charSet.contains(s.charAt(r))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(r));
            }
        }
        return maxLength;
    }
}