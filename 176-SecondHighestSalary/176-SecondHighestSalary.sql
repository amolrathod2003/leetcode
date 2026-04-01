-- Last updated: 4/1/2026, 10:45:06 PM
# Write your MySQL query statement below
SELECT 
    (
        SELECT DISTINCT salary
        FROM Employee
        ORDER BY salary DESC
        LIMIT 1 OFFSET 1
    ) AS SecondHighestSalary;

