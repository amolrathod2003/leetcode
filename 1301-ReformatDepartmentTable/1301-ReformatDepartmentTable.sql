-- Last updated: 4/1/2026, 10:41:53 PM
# Write your MySQL query statement below
select id , 
max(case when month = 'jan'  then revenue  end) as Jan_revenue,
max(case when month = 'feb'  then revenue  end) as Feb_revenue,
max(case when month = 'mar'  then revenue  end) as Mar_revenue,
max(case when month = 'apr'  then revenue  end) as Apr_revenue,
max(case when month = 'may'  then revenue  end) as May_revenue,
max(case when month = 'jun'  then revenue  end) as Jun_revenue,
max(case when month = 'jul'  then revenue  end) as Jul_revenue,
max(case when month = 'aug'  then revenue end) as Aug_revenue,
max(case when month = 'sep'  then revenue  end) as Sep_revenue,
max(case when month = 'oct'  then revenue  end) as Oct_revenue,
max(case when month = 'nov'  then revenue  end) as Nov_revenue,
max(case when month = 'dec'  then revenue end) as Dec_revenue
from Department group by id;