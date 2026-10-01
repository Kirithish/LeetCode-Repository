// Last updated: 10/1/2026, 9:37:55 AM
1class Solution {
2    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
3        return (arrivalTime+delayedTime)%24;
4    }
5}