-- Last updated: 2/25/2026, 9:10:15 AM
SELECT P.firstName, P.lastName, A.city, A.state FROM Person P 
LEFT JOIN Address A ON P.personID=A.personId

