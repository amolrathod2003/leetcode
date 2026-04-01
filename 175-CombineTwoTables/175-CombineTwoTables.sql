-- Last updated: 4/1/2026, 10:45:07 PM
# Write your MySQL query statement below
SELECT
p.firstName,
p.lastName,
a.city,
a.state
FROM Person p
LEFT JOIN Address a
ON p.personId=a.personId;



