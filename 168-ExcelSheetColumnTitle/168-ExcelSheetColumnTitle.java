// Last updated: 2/25/2026, 9:10:20 AM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder t=new StringBuilder();

        while(columnNumber>0){
            columnNumber--;
            int d=columnNumber%26;
            t.append((char)(d+'A'));
            columnNumber/=26;
        }
        return t.reverse().toString();
    }
}