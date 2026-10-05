-- Last updated: 10/5/2026, 10:06:54 AM
# Write your MySQL query statement below
select 
    employee_id,
    case 
        when employee_id%2 =1 and name not like 'M%' then salary 
        else 0
    end as bonus
from employees 
order by employee_id;