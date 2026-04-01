-- Last updated: 4/1/2026, 10:45:00 PM
# Write your MySQL query statement below
select email as Email
 from person
GROUP by email 
having count(*)>1;