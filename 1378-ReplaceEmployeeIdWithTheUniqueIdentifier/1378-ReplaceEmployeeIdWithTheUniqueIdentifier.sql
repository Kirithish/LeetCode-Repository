-- Last updated: 10/5/2026, 10:07:38 AM
# Write your MySQL query statement below
select U.unique_id,E.name from Employees E left join EmployeeUNI U ON E.id=U.id 