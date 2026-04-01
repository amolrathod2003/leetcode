-- Last updated: 4/1/2026, 10:43:19 PM
# Write your MySQL query statement below
select * from cinema
where id % 2 = 1
and description != 'boring'
order by rating desc;
