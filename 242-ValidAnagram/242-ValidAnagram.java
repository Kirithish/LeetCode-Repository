// Last updated: 2/25/2026, 9:09:56 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch=s.toCharArray();
        char[] ph=t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ph);

        return new String(ch).equals(new String(ph));
    }
}