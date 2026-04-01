-- Last updated: 4/1/2026, 10:41:14 PM
# Write your MySQL query statement below
SELECT * 
FROM Users
WHERE REGEXP_LIKE(mail, '^[a-zA-Z][a-zA-Z0-9._-]*@leetcode\\.com$', 'c');



 
