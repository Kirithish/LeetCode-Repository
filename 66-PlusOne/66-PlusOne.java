// Last updated: 10/6/2026, 10:03:39 AM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        
4    int n = digits.length;
5    for(int i=n-1; i>=0; i--) {
6        if(digits[i] < 9) {
7            digits[i]++;
8            return digits;
9        }
10        
11        digits[i] = 0;
12    }
13    
14    int[] newNumber = new int [n+1];
15    newNumber[0] = 1;
16    
17    return newNumber;
18}
19}