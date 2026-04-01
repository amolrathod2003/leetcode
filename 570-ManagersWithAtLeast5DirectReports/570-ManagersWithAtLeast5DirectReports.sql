-- Last updated: 4/1/2026, 10:43:32 PM
# Write your MySQL query statement below
SELECT e.name
FROM Employee AS e 
INNER JOIN Employee AS m ON e.id=m.managerId 
GROUP BY m.managerId 
HAVING COUNT(m.managerId) >= 5