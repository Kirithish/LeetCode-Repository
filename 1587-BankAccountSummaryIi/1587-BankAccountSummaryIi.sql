-- Last updated: 10/5/2026, 10:07:23 AM
# Write your MySQL query statement below
with cte as(
    select 
        name as NAME,
        sum(amount) as BALANCE
    from transactions join users
    on users.account=transactions.account
    group by name
)

select * from cte where balance>10000;