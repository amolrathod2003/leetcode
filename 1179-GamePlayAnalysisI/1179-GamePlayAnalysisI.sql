-- Last updated: 4/1/2026, 10:42:01 PM
# Write your MySQL query statement below
select
player_id,
MIN(event_date) as first_login
from 
Activity
group by
player_id;
