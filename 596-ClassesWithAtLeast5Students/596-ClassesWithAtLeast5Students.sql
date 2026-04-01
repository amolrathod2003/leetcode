-- Last updated: 4/1/2026, 10:43:25 PM
# Write your MySQL query statement below
select class
from courses
group by class
having count(student)>=5;
