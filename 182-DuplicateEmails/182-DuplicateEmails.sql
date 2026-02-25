-- Last updated: 2/25/2026, 9:10:10 AM
SELECT email FROM PERSON 
GROUP BY email HAVING COUNT(email)>1;
