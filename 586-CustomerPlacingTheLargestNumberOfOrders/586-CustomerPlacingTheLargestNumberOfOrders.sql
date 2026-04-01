-- Last updated: 4/1/2026, 10:43:27 PM
# Write your MySQL query statement below
SELECT customer_number 
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;

