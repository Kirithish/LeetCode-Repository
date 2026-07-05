// Last updated: 7/5/2026, 9:30:05 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0, right = height.length - 1;
4    int maxArea = 0;
5    
6    while (left < right) {
7        int h = Math.min(height[left], height[right]);
8        int area = h * (right - left);
9        maxArea = Math.max(maxArea, area);
10        
11        if (height[left] < height[right]) {
12            left++;
13        } else {
14            right--;
15        }
16    }
17    
18    return maxArea;
19    }
20}