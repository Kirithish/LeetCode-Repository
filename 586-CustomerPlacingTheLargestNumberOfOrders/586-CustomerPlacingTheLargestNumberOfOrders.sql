-- Last updated: 10/5/2026, 10:08:41 AM
# Write your MySQL query statement below
with cte as(
    select 
        customer_number,
        count(order_number)
    from orders
    group by customer_number
    order by count(order_number) desc
)

select customer_number from cte limit 1;