// Last updated: 2/25/2026, 9:10:37 AM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String[] arr=s.split(" ");
        return arr[arr.length-1].length();
    }
}