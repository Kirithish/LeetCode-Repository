// Last updated: 6/10/2026, 7:59:48 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3       if(s.length()!=t.length()){
4        return false;
5       }
6
7       char[] c=s.toCharArray();
8       char[] p=t.toCharArray();
9
10       Arrays.sort(c);
11       Arrays.sort(p);
12
13       return new String(c).equals(new String(p));
14
15
16
17
18    }
19}