-- Last updated: 10/5/2026, 10:06:56 AM
select 
    employee_id,
    department_id
from employee
where primary_flag='Y'

union 

select 
    employee_id,
    department_id
from employee 
group by employee_id having count(*)=1;