# Last updated: 2/25/2026, 9:10:31 AM
class Solution(object):
    def removeDuplicates(self, nums):
        c={}
        for i in nums:
            if i in c:
                c[i]+=1
            else:
                c[i]=1
        for key in c:
            if c[key]>2:
                d=key
                p=c[key]
                for i in range(p):
                    if p>2:
                        nums.remove(key)
                        p-=1
                    
        return len(nums)

        