-- Last updated: 2/25/2026, 9:09:11 AM
SELECT 
    customer_id,
   COUNT(V.visit_id) AS count_no_trans 
FROM Visits V LEFT JOIN Transactions T 
ON V.visit_id =T.visit_id 
WHERE T.transaction_id IS NULL
GROUP BY customer_id

