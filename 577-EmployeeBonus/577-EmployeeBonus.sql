-- Last updated: 2/25/2026, 9:09:37 AM
# Write your MySQL query statement below
select name , bonus from Employee e left join Bonus b on e.empId=b.empId where bonus<1000 or bonus is null