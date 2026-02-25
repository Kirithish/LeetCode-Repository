-- Last updated: 2/25/2026, 9:09:30 AM
# Write your MySQL query statement below
select * from Cinema where id%2!=0 and description !='boring' order by rating desc