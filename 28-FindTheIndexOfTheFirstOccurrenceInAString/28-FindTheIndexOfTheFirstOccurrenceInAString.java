// Last updated: 2/25/2026, 9:10:43 AM
class Solution {
    public int strStr(String haystack, String needle) {
       if(haystack.contains(needle)){
            return haystack.indexOf(needle);
       }
       else{
            return -1;
       }
    }
}