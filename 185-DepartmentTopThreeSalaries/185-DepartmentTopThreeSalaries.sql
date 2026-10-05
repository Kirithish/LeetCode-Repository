-- Last updated: 10/5/2026, 10:09:25 AM
# Write your MySQL query statement below
with CTE as (
    select e.name as Employee , e.Salary, d.name as Department,
    DENSE_RANK() over (partition by d.name order by e.Salary desc) as Rnk
    from Employee e 
    left join Department d on e.departmentId = d.id
) 

select Department, Employee, Salary from CTE 
where RNK in (1,2,3)
