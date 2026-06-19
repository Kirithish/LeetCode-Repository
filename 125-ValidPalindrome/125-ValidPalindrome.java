// Last updated: 6/19/2026, 2:34:23 PM
1
2class Solution {
3    public boolean isPalindrome(String s) {
4        s=s.toLowerCase();
5        StringBuilder sb=new StringBuilder();
6        for(int i=0;i<s.length();i++){
7            char ch=s.charAt(i);
8            if(Character.isLetter(ch) || Character.isDigit(ch)){
9                sb.append(ch);
10            }
11        }
12        String t=sb.toString();
13        String p=sb.reverse().toString();
14        return t.equals(p);
15    }
16}