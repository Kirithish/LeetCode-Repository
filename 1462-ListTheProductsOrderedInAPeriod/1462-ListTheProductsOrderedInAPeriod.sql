-- Last updated: 2/25/2026, 9:09:17 AM
select product_name, sum(unit) as unit 
from orders o join products p on o.product_id=p.product_id
where MONTH(order_date)=2 and YEAR(order_date)=2020
group by product_name having sum(unit)>=100;
