// Last updated: 6/10/2026, 8:09:12 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3       int[] ch=new int[26];
4       for(int i=0;i<s.length();i++){
5            ch[s.charAt(i) -'a']++;
6
7       }
8       for(int j=0;j<t.length();j++){
9            ch[t.charAt(j) - 'a']--;
10       }
11
12       for(int i:ch){
13            if(i!=0){
14                return false;
15            }
16       }
17       return true;
18
19
20
21    }
22}