# Last updated: 2/25/2026, 9:10:54 AM
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        c=nums1+nums2
        c.sort()
        n=len(c)
        mid=n//2
        if n%2==0:
            a=c[mid - 1] + c[mid]
            return a/2.0
        else:
            return c[mid] 
        
