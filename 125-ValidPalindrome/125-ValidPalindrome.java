// Last updated: 2/25/2026, 9:10:29 AM
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder t=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                t.append(ch);
            }
        }
        String k=t.toString();
        String result=t.reverse().toString();
        return result.equals(k);
    }
}