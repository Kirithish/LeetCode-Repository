# Last updated: 2/25/2026, 9:10:18 AM
class Solution(object):
    def majorityElement(self, nums):
        c={}
        m=0
        t=0
        for i in nums:
            if i in c:
                c[i]+=1
            else:
                c[i]=1
        for key in c:
            if c[key]>=m:
                m=c[key]
                t=key
        return t

