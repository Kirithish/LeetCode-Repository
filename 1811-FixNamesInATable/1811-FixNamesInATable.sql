-- Last updated: 2/25/2026, 9:09:06 AM
SELECT user_id, CONCAT(left(upper(name),1),LOWER(substring(name,2,length(name)))) AS name from users 
order by user_id;
