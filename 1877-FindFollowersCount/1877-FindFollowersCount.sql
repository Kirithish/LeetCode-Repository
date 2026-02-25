-- Last updated: 2/25/2026, 9:09:00 AM
# Write your MySQL query statement below
select user_id , count(user_id) as followers_count from Followers group by user_id order by user_id asc