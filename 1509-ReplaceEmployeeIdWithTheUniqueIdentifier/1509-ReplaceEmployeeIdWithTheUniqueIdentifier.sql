-- Last updated: 4/1/2026, 10:41:31 PM
# Write your MySQL query statement below
SELECT eu.unique_id,name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id=eu.id
