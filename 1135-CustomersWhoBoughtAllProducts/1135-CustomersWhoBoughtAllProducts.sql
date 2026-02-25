-- Last updated: 2/25/2026, 9:09:28 AM
# Write your MySQL query statement below

SELECT  customer_id FROM Customer GROUP BY customer_id
HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) FROM Product)