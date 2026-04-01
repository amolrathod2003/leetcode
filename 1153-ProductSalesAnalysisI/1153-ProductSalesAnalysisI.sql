-- Last updated: 4/1/2026, 10:42:08 PM
# Write your MySQL query statement below
select product_name,year,price from sales
left JOIN product
on sales.product_id=product.product_id;

