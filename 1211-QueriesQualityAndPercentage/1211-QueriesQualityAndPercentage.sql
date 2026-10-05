-- Last updated: 10/5/2026, 10:07:51 AM
select
    query_name,
    round(avg(rating/position),2) as quality,
    round(count(case when rating<3 then 1 end)/count(*),4)*100 as poor_query_percentage
from queries
group by query_name;

