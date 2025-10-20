# Write your MySQL query statement below
with cte as
(select user_id,lower(name) as lowname from Users)

select user_id, concat(upper(substr(lowname,1,1)),substr(lowname,2)) as name from cte order by user_id asc;