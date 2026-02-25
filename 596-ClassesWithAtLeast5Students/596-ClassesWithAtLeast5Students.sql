-- Last updated: 2/25/2026, 9:09:33 AM
# Write your MySQL query statement below
select class from Courses group by class having count(distinct student)>=5