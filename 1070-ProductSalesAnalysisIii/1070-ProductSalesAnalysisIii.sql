-- Last updated: 10/5/2026, 10:08:13 AM
SELECT s.product_id, 
       s.year AS first_year, 
       s.quantity, 
       s.price
FROM Sales s
JOIN (SELECT product_id, MIN(year) AS first_year
      FROM Sales
      GROUP BY product_id) first_sales
ON s.product_id = first_sales.product_id 
AND s.year = first_sales.first_year;

