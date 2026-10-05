-- Last updated: 10/5/2026, 10:07:24 AM
SELECT 
    customer_id,
   COUNT(V.visit_id) AS count_no_trans 
FROM Visits V LEFT JOIN Transactions T 
ON V.visit_id =T.visit_id 
WHERE T.transaction_id IS NULL
GROUP BY customer_id

