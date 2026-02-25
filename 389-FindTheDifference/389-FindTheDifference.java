// Last updated: 2/25/2026, 9:09:41 AM
class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> list = new ArrayList<>();

for(char c : t.toCharArray()) {
    list.add(c);
}

for(char c : s.toCharArray()) {
    list.remove(Character.valueOf(c));
}

return list.get(0);


    }
}