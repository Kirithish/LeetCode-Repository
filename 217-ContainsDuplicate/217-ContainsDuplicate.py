# Last updated: 2/25/2026, 9:10:00 AM
class Solution(object):
    def containsDuplicate(self, nums):
        c=set()
        d=0
        for i in nums:
            if i in c:
                return True
           
            c.add(i)
        return False
        