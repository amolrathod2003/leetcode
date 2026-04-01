-- Last updated: 4/1/2026, 10:45:01 PM
# Write your MySQL query statement below
select e.name as employee
from employee e
join employee m
on e.managerId=m.id
where e.salary>m.salary;
