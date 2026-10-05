-- Last updated: 10/5/2026, 10:09:34 AM
# Write your MySQL query statement below
SELECT
    e.name AS Employee
FROM Employee e JOIN Employee m 
ON e.managerId=m.Id
WHERE e.salary>m.salary;
