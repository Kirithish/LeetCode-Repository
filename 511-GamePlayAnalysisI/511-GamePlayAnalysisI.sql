-- Last updated: 10/5/2026, 10:08:07 AM
# Write your MySQL query statement below
select 
    player_id,
    min(event_date) as first_login
from activity
group by player_id;