-- Last updated: 2/25/2026, 9:09:16 AM
# Write your MySQL query statement below
select U.unique_id,E.name from Employees E left join EmployeeUNI U ON E.id=U.id 