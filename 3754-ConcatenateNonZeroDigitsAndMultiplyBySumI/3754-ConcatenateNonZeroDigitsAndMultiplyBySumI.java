// Last updated: 10/5/2026, 10:06:45 AM
class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        long num=0;
        while(n>0){
            long a=n%10;
            if(a!=0){
                sum+=a;
                num=(num*10)+a;
            }
            n=n/10;
        }
        long num2=0;
        while(num>0){
            long a=num%10; 
            num2=(num2*10)+a;
            num=num/10;
        }

        long result=num2*sum;
        return result;
    }
}