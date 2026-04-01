-- Last updated: 4/1/2026, 10:41:57 PM
# Write your MySQL query statement below
select distinct activity_date as day,count(distinct user_id)  as active_users
from Activity 
where activity_date between '2019-06-28' and '2019-07-27'
group by activity_date