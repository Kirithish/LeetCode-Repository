// Last updated: 2/25/2026, 9:09:46 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] arr=s.split(" ");
        int n=arr.length;
        if(pattern.length() != arr.length) return false;

        for(int i = 0; i < pattern.length(); i++) {
    char p = pattern.charAt(i);
    String word = arr[i];

    if (!map.containsKey(p) && !map.containsValue(word)) {
        map.put(p, word);
    }
    else if (map.containsKey(p) && !map.get(p).equals(word)) {
        return false;
    }
    else if (!map.containsKey(p) && map.containsValue(word)) {
        return false;
    }
}
    
        return true;
    }
}