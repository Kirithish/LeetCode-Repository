-- Last updated: 10/5/2026, 10:07:37 AM
# Write your MySQL query statement below
SELECT 
    stock_name,
    (SUM(CASE WHEN operation="Sell" THEN price ELSE 0 END )-SUM(CASE WHEN operation="Buy" THEN price ELSE 0 END)) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name;