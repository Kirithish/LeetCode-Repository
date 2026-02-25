-- Last updated: 2/25/2026, 9:10:09 AM
SELECT C.name AS Customers FROM CUSTOMERS C 
 LEFT JOIN ORDERS O ON C.id = O.customerId 
WHERE O.id IS NULL

