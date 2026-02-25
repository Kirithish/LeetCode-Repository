// Last updated: 2/25/2026, 9:09:44 AM
class Solution {
    public void reverseString(char[] s) {
       int i=0;
       int j=s.length-1;
       while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;

            i++;
            j--;
       }

        
    }
}