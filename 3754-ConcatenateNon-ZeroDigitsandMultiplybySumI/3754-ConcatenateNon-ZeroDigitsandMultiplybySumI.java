// Last updated: 7/7/2026, 3:17:46 PM
1class Solution {
2    public long sumAndMultiply(int n) {
3        int sum=0;
4        long num=0;
5        while(n>0){
6            long a=n%10;
7            if(a!=0){
8                sum+=a;
9                num=(num*10)+a;
10            }
11            n=n/10;
12        }
13        long num2=0;
14        while(num>0){
15            long a=num%10; 
16            num2=(num2*10)+a;
17            num=num/10;
18        }
19
20        long result=num2*sum;
21        return result;
22    }
23}