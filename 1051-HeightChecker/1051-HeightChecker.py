# Last updated: 10/5/2026, 10:08:22 AM
class Solution(object):
    def heightChecker(self, heights):
        n=len(heights)
        c=sorted(heights)
        s=0
        for i in range(n):
            if heights[i]!=c[i]:
                s+=1
            
        return s