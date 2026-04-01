-- Last updated: 4/1/2026, 10:43:21 PM
# Write your MySQL query statement below

select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle
