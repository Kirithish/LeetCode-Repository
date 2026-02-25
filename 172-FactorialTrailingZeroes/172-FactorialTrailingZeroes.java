// Last updated: 2/25/2026, 9:10:17 AM
class Solution {
    public int trailingZeroes(int n) {
        if(n<=4){
            return 0;
        }
        int result=0;
        for(int i=5;n/i>0;i*=5){
            result+=n/i;
        }

        return result;

    }
}