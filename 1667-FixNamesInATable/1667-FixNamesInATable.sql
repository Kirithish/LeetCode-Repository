-- Last updated: 10/5/2026, 10:07:11 AM
SELECT user_id, CONCAT(left(upper(name),1),LOWER(substring(name,2,length(name)))) AS name from users 
order by user_id;
