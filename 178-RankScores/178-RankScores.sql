-- Last updated: 10/5/2026, 10:09:39 AM
# Write your MySQL query statement below
select 
    score,
    DENSE_RANK() OVER(Order by score DESC) as 'rank'
from Scores;