-- Last updated: 4/1/2026, 10:44:56 PM
DELETE p1
FROM Person p1
JOIN Person p2
ON p1.email = p2.email
AND p1.id > p2.id;
