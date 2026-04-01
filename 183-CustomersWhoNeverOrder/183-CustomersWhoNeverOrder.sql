-- Last updated: 4/1/2026, 10:44:58 PM
# Write your MySQL query statement below
select name as customers
from customers 
where id not in(
    select customerId
    from orders
);
