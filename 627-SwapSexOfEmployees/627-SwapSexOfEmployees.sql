-- Last updated: 10/5/2026, 10:08:24 AM
# Write your MySQL query statement below
update salary set sex= 
case sex
    when 'm' then 'f'
    else 'm'
end;