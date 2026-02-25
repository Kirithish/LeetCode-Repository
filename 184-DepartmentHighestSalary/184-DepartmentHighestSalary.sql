-- Last updated: 2/25/2026, 9:10:08 AM
SELECT D.name as Department,E.name as employee,E.salary 
from employee E join department D on E.departmentId =D.id 
WHERE E.salary = (
    SELECT MAX(salary)
    FROM Employee
    WHERE departmentId = E.departmentId
);