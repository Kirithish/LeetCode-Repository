// Last updated: 2/25/2026, 9:09:43 AM
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> check=new HashMap<>();
        for(int i=0;i<s.length();i++){
            int count=check.getOrDefault(s.charAt(i),0)+1;
            check.put(s.charAt(i),count);
        }
        for(int i=0;i<s.length();i++){
            if(check.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}